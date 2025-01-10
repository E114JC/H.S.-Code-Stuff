library(tidyverse)
library(ggplot2)
install.packages("readxl")
library("readxl")
install.packages("janitor")
library(janitor)
df<- read_excel('Superstore (1).xlsx')
df <- clean_names(df)
df <- df %>%
  select(category, customer_name, customer_id, department, discount, order_date, order_priority, order_quantity, profit, region, sales, ship_mode, shipping_cost, state)
df<- df %>%
  mutate(
  expenses = sales - profit
  )
df<- df %>%
  mutate(large_discount = if_else(discount > 0.10, "Yes", "No"))
df2 <- df|>
  separate_wider_delim(customer_name, delim = " ", names = c("First", "Middle", "Last"), too_few = "debug")
df2<- df2 %>%
  filter(Last != "NA")|>
  distinct(customer_id)
glimpse(df2)

df<- df %>%
  separate_wider_delim(customer_name, delim = " ", names = c("First", "Middle", "Last"), too_few = "debug")
df<- df %>%
  filter(is.na(Last) ==TRUE)
glimpse(df)
df<- df %>%
  relocate(where(is.numeric), .after = last_col())
glimpse(df)

df3 <- df %>%
  filter(region == 'East')|>
  group_by(state)|>
  summarise(total_sales = sum(sales))

df4 <- df %>%
  group_by(state, department)|>
  summarise(total_sales = mean(profit))
glimpse(df4)

df5 <- df %>%
  separate_wider_delim(order_date, delim = "-", names = c("Year", "Month", "Day"))
df5 <- df5 %>%
  group_by(Month)|>
  summarise(total_quantity = sum(order_quantity))|>
  arrange(desc(total_quantity))
glimpse(df5)

df6 <- df%>%
  group_by(department)|>
  summarise(min_discount = min(discount, na.rm = FALSE), max_discount = max(discount, na.rm = FALSE), mean_discount = mean(discount), count = n())
glimpse(df6)  

df <- df %>%
  separate_wider_delim(order_date, delim = "-", names = c("Year", "Month", "Day"))  
ggplot(df, aes(x = Year, y = profit, color = Month )) +
  geom_point() + 
  facet_wrap(~department)+
  labs(title = 'Total Profit by Month, Year, and Department')
