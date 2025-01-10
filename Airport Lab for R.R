library(tidyverse)
library(ggplot2)
df<- read_csv('nycflights13.csv')
df<- df %>% 
  rename(dew_point = dewp)|>
  rename(temperature = temp)|>
  rename(visibility = visib)
glimpse(df)
df<- df %>% 
  mutate(
    temperature_celsius = (temperature - 32)* (5/9),
    .before = 1
  )
glimpse(df)
df<- distinct(df)
glimpse(df)
df|>
  filter(month==7, year ==2013, origin =='EWR', precip >0)|>
  relocate(precip)|>
  arrange(desc(precip))

df|>
  group_by(origin, month)|>
  summarize(
    temperature = mean(temperature, na.rm = TRUE)
  )|>
  print(n=36)

df.new = df[seq(1, nrow(df), 10), ]
ggplot(
  data = df.new, mapping = aes(x = wind_speed, y = pressure, color = origin)
)+
  geom_point()+
  labs(title = 'Pressure vs. Wind Speed', x = 'Wind Speed', y ='Pressure')

labs(title = 'Pressure vs. Wind Speed', x = 'Wind Speed', y ='Pressure')

ggplot(df, aes(x = temperature)) +
  geom_histogram(binwidth = 10, fill = "pink") +
  labs(title = 'Temperature for Flights ', x = 'Temperature', y ='Count of Flights')
glimpse(df)
boxplot(humid~origin,
        data=df,
        main="Different Humidity for Each Airport",
        xlab="Airport",
        ylab="Humidity",
        col="orange",
        border="brown"
)

ggplot(df, aes(x = wind_speed, y =temperature, color = origin )) +
  geom_point() + 
  facet_wrap(~origin)+
  labs(title = 'Temperature vs. Wind Speed', x = 'Wind Speed', y ='Temperature')