my_variable <-10
  my_variable
library(tidyverse)
library(ggplot2)
  
ggplot(mpg, aes(x = displ, y = hwy) ) + 
    geom_point() +
    geom_smooth(method = lm)

my_bar_plot <- ggplot(mpg, aes(x = class)) +
  geom_bar()
my_scatter_plot <- ggplot(mpg, aes(x = cty, y = hwy)) +
  geom_point()
ggsave(filename = "mpg-plot.png", plot = my_bar_plot)

library(nycflights13)
flights |>
  filter(dest == "IAH" | dest=="HOU") |> 
  filter(month==7 | month ==8 | month==9) |>
  filter(arr_delay>=2 & dep_delay==0)|>
  filter(carrier =='UA'| carrier=='AA' | carrier =='DL') 
  
library(nycflights13)
flights |>
  arrange(desc(dep_delay))|>
  arrange(dep_time)

flights |> 
  arrange(arr_time - dep_time)

flights |> 
  distinct(month, day)
flights|>
  arrange(distance)
flights|>
  arrange(desc(distance))

library(nycflights13)
flights|>
  select(dep_time, sched_dep_time, dep_delay)

library(nycflights13)
flights|>
  
library(nycflights13)
variables <- c("year", "month", "day", "dep_delay", "arr_delay")

flights |> select(contains("TIME"))

flights |> 
  rename(air_time_min = air_time)|>
  relocate(air_time_min, year)


flights |> 
  select(tailnum) |> 
  arrange(arr_delay)
#> Error in `arrange()`:
#> ℹ In argument: `..1 = arr_delay`.
#> Caused by error:
#> ! object 'arr_delay' not found

flights|>
  mutate(
    avg_delay = mean(dep_delay, na.rm = TRUE), 
    .before = 1,
    flights = n(),
    .by = c(carrier, dest)
  )|>
  arrange(desc(avg_delay))|>
  distinct(carrier, dest, avg_delay)

flights|>
  arrange(desc(dep_delay))|>
  distinct(dest, dep_delay)
library(nycflights13)
ggplot(
  data = flights,
  mapping = aes(x = sched_dep_time, y = dep_delay)
)+
  geom_smooth()

