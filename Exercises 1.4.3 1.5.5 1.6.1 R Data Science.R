library(palmerpenguins)
library(ggplot2)
ggplot(penguins, aes(y=species)) + geom_bar()
ggplot(penguins, aes(x = species)) +
  geom_bar(color = "red")
ggplot(penguins, aes(x = species)) +
  geom_bar(fill = "red")
ggplot(diamonds, aes(x = carat)) +
  geom_histogram(binwidth = .1, fill = "pink") 
?mpg
ggplot(mpg, aes(x = displ, y= hwy)) +
  geom_point() +
  geom_smooth()
ggplot(mpg, aes(x = displ, y= hwy, color = cty)) +
  geom_point() 
ggplot(mpg, aes(x = displ, y= hwy, size = cty)) +
  geom_point() 
ggplot(mpg, aes(x = displ, y= hwy, shape = cty)) +
  geom_point() 
ggplot(mpg, aes(x = hwy, y= displ, linewidth = cty)) +
  geom_point() +
  geom_smooth()
ggplot(mpg, aes(x = hwy, y= displ)) +
  geom_point() +
  geom_smooth()
ggplot(penguins, aes(x = bill_length_mm, y = bill_depth_mm, color = species )) +
  geom_point() + 
  facet_wrap(~species)
ggplot(mpg, aes(x = displ, y= hwy, color = cty, size = cty)) +
  geom_point()
ggplot(
  data = penguins,
  mapping = aes(
    x = bill_length_mm, y = bill_depth_mm, 
    color = species, shape = species
  )
) +
  geom_point()
ggplot(penguins, aes(x = island, fill = species)) +
  geom_bar(position = "fill")
ggplot(penguins, aes(x = species, fill = island)) +
  geom_bar(position = "fill")
ggplot(mpg, aes(x = class)) +
  geom_bar()
ggplot(mpg, aes(x = cty, y = hwy)) +
  geom_point()
ggsave("mpg-plot.png")