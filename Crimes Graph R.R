library(ggplot2)
library(ggdendro)
library(dplyr)
library(tidyr)
df <- read.csv("estimated_crimes_1979_2019.csv")
dff <- df %>% 
  select(state_name, homicide, year)|>
  filter(year==2014 & state_name!="")
  
glimpse(dff)
theme_set(theme_bw())

hc <- hclust(dist(dff),  "ave")  # hierarchical clustering

# plot
plot(hc, labels=dff$state_name, hang = -1, cex = 0.6)

plot(as.dendrogram(hc), horiz = T)


install.packages("ape")
library(ape)
colors = c("red", "blue", "green", "black")
clus4 = cutree(hc, 4)
plot(as.phylo(hc), type = "fan", tip.color = colors[clus4],
     label.offset = 1, cex = 0.7)

p <- ggplot(dff) + 
  geom_segment(aes(x = state.name, y = homicide, xend = xend, yend = yend))+
  geom_text(data = dff$labels, aes(x, y, label = label),
            hjust = 1, angle = 90, size = 3)+
  ylim(-3, 15)
print(p)