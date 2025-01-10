library(dplyr)
library(tidyr)
library(ggplot2)
library(readxl)

df <- read_excel("R Weather Graphic Input.xlsx", sheet = "Crater Lake")
glimpse(df)

names(df) <- c("Month", "Day", "Year", "TempH", "TempL", "Precip", "Snow"
               , "AvgH", "AvgL", "RecordH", "RecordL")
glimpse(df)

Past <- df %>%
  mutate(newDay = seq(1, length(Day))) %>%   # label days as 1:365 (will represent x-axis)        
  ungroup() %>%
  mutate(Temp = (TempH + TempL) / 2) %>%
  filter(Temp != -99 & Year != 2024) %>%     # filter out missing data (identified with '-99' value) & current year data
  group_by(newDay) %>%
  mutate(upper = max(TempH), # identify max value for each day
         lower = min(TempL), # identify min value for each day
         avg = mean(Temp),  # calculate mean value for each day
         se = sd(Temp)/sqrt(length(Temp))) %>%  # calculate standard error of mean
  mutate(avg_upper = avg+(2.101*se),  # calculate 95% CI for mean
         avg_lower = avg-(2.101*se)) %>%  # calculate 95% CI for mean
  ungroup()

Present <- df %>%
  group_by(Year, Month) %>%
  arrange(Day) %>%
  ungroup() %>%
  group_by(Year) %>%
  mutate(newDay = seq(1, length(Day))) %>%  # create matching x-axis as historical data
  ungroup() %>%
  mutate(Temp = (TempH + TempL) / 2) %>%
  filter(Temp != -99 & Year == 2024)  # filter out missing data & select current year data


p <- ggplot(Past, aes(newDay, Temp)) +
  theme(plot.background = element_blank(),
        panel.grid.minor = element_blank(),
        panel.grid.major = element_blank(),
        panel.border = element_blank(),
        panel.background = element_blank(),
        axis.ticks = element_blank(),
        #axis.text = element_blank(),  
        axis.title = element_blank()) +
  geom_linerange(Past, mapping=aes(x=newDay, ymin=RecordL, ymax=RecordH), colour = "wheat", alpha=.5)

print(p)

p <- p +
  geom_linerange(Past, mapping=aes(x=newDay, ymin=AvgL, ymax=AvgH), colour = "wheat4")

print(p)

p <- p +
  geom_line(Present, mapping=aes(x=newDay, y=Temp, group=1)) +
  geom_vline(xintercept = 0, colour = "wheat4", linetype=1)

print(p)

p <- p +
  geom_hline(yintercept = -20, colour = "white", linetype=1) +
  geom_hline(yintercept = -10, colour = "white", linetype=1) +
  geom_hline(yintercept = 0, colour = "white", linetype=1) +
  geom_hline(yintercept = 10, colour = "white", linetype=1) +
  geom_hline(yintercept = 20, colour = "white", linetype=1) +
  geom_hline(yintercept = 30, colour = "white", linetype=1) +
  geom_hline(yintercept = 40, colour = "white", linetype=1) +
  geom_hline(yintercept = 50, colour = "white", linetype=1) +
  geom_hline(yintercept = 60, colour = "white", linetype=1) +
  geom_hline(yintercept = 70, colour = "white", linetype=1) +
  geom_hline(yintercept = 80, colour = "white", linetype=1) +
  geom_hline(yintercept = 90, colour = "white", linetype=1) +
  geom_hline(yintercept = 100, colour = "white", linetype=1)

print(p)

p <- p +
  geom_vline(xintercept = 31, colour = "wheat4", linetype=3, size=.5) +
  geom_vline(xintercept = 59, colour = "wheat4", linetype=3, size=.5) +
  geom_vline(xintercept = 90, colour = "wheat4", linetype=3, size=.5) +
  geom_vline(xintercept = 120, colour = "wheat4", linetype=3, size=.5) +
  geom_vline(xintercept = 151, colour = "wheat4", linetype=3, size=.5) +
  geom_vline(xintercept = 181, colour = "wheat4", linetype=3, size=.5) +
  geom_vline(xintercept = 212, colour = "wheat4", linetype=3, size=.5) +
  geom_vline(xintercept = 243, colour = "wheat4", linetype=3, size=.5) +
  geom_vline(xintercept = 273, colour = "wheat4", linetype=3, size=.5) +
  geom_vline(xintercept = 304, colour = "wheat4", linetype=3, size=.5) +
  geom_vline(xintercept = 334, colour = "wheat4", linetype=3, size=.5) +
  geom_vline(xintercept = 365, colour = "wheat4", linetype=3, size=.5)

print(p)

p <- p +
  coord_cartesian(ylim = c(-20,100)) +
  scale_y_continuous(breaks = seq(-20,100, by=10)) +
  scale_x_continuous(expand = c(0, 0),
                     breaks = c(15,45,75,105,135,165,195,228,258,288,320,350),
                     labels = c("January", "February", "March", "April",
                                "May", "June", "July", "August", "September",
                                "October", "November", "December"))

print(p)

p <- p +
  geom_line(data = Past, aes(x=newDay, y=TempL), colour="blue") +
  geom_line(data = Past, aes(x=newDay, y=TempH), colour="red")

print(p)




p <- p +
  labs(title = "Crater Lake's Weather in 2022" )+
  annotate("text", x = 23, y = 105, label = "Temperature", size=4, fontface="bold")+
  annotate("text", x = 80, y = 102, 
           label = "Data represents average daily temperatures for Crater Lake in 2022.", size=3, colour="gray30")

print(p)
