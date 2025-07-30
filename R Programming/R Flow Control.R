x <- 30L
if(is.character(x))
{print('X is an integer')}else{print('X is not an integer')}
v <- c('Hello World')
count <- 2
while(count < 5){
  print(v)
  count = count+1}

names <- c('a', 'b', 'c', 'd', 'e')
names
for(i in names){
  print(i)
}

#Logical Operations
x <- 25
x < 10
x >10
x < 20 & x >10
x > 10 | x < 5
12 == 3


df <- mtcars
df
df[df$mpg>30,]
subset(df,mpg>20)
df[df$mpg>=20 & df$hp>100,]

x <- 63
if(x>80){
  print('Good Score')
} else if(x>60 & x<80){
  print('Descent Score')
} else{
  print('Poor Score')
}

#Working with while loops
x <- 0
while(x<10){
  cat('x is currently: ', x)
  print('x is still less than 10, adding 1 to x')
  x<-x+1
  if(x==10){
    print('x is equal to 10! Terminating the loop')
  }
}