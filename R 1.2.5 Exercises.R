penguins
glimpse(penguins)
ggplot(data = penguins)
ggplot(
  data = penguins,
  mapping = aes(x = bill_length_mm, y = bill_depth_mm)
)  +
  geom_point()
#> Warning: Removed 2 rows containing missing values or values outside the scale range
#> (`geom_point()`).
ggplot(
  data = penguins,
  mapping = aes(x = bill_depth_mm, y = species)
)  +
  geom_point()
#> Warning: Removed 2 rows containing missing values or values outside the scale range
#> (`geom_point()`).
p <- ggplot(
  data = penguins,
  mapping = aes(x = flipper_length_mm, y = body_mass_g)
)  +
  geom_point(na.rm = TRUE)
#> Warning: Removed 2 rows containing missing values or values outside the scale range
#> (`geom_point()`).
p + labs(caption = "Data come from the palmerpenguins package.")
ggplot(
  data = penguins,
  mapping = aes(x = flipper_length_mm, y = body_mass_g, color = bill_depth_mm)
)  +
  geom_point() +
  geom_smooth()
#> Warning: Removed 2 rows containing missing values or values outside the scale range
#> (`geom_point()`).
ggplot(
  data = penguins,
  mapping = aes(x = flipper_length_mm, y = body_mass_g, color = island)
) +
  geom_point() +
  geom_smooth(se = FALSE)

  ggplot(
    data = penguins,
    mapping = aes(x = flipper_length_mm, y = body_mass_g)
  ) +
  geom_point() +
  geom_smooth()

ggplot() +
  geom_point(
    data = penguins,
    mapping = aes(x = flipper_length_mm, y = body_mass_g)
  ) +
  geom_smooth(
    data = penguins,
    mapping = aes(x = flipper_length_mm, y = body_mass_g)
  )
