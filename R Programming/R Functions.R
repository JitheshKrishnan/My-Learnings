# Functions in R

#Simple function, no inputs!
hello_world <- function(){
  print('hello world in R')
}
hello_world()

#Function with a single argument
hello_name <- function(name){
  print(paste("hello",name))
}
hello_name('john')
 
#Function to add two numbers
add_num <- function(a,b){
  x <- a+b
  print(x)
}
add_num(2,6)

#Add a vector to a number
add_num(c(1,2,3,4,5),4)

#Function with default argument values
hello_name <- function(name = 'Rick'){
  print(paste('hello', name))
}
hello_name()
hello_name('sam')
hello_name(name = 'jerry')

#Return a value from a function
full_name <- function(name = 'sachin', title = 'tendulkar'){
  return(paste(name,' ',title))
}
full_name()
full_name('hi','hello')

#Builtin functions

#to generate 1000 random values from a normal distribution of mean 0 and 1
normaldist <- rnorm(1000,0,1)
mean(normaldist)
hist(normaldist)

#For looking into the documentation of a builtin fn we use ?
?hist
hist(normaldist, breaks = 60)
hist(normaldist, 10)

expovalue <- function(x, power = 2){
  hist(x^power)
}
expovalue(normaldist)

expovalue(normaldist, power = 3)
expovalue(normaldist, 4)

#Using named arguments and passing any other arguments
expovalue <- function(x, power = 2, ...){
  hist(x^power, ...)
}
expovalue(normaldist,power = 2, breaks = 50)

#Passing logical arguments
expovalue <- function(x, exp = 2, hist = FALSE, ...){
  if(hist == TRUE){
    hist(x^exp)
    x^exp
  }else{
    x^exp
  }
}
expovalue(normaldist)
expovalue(normaldist, hist = TRUE)

#Scope of variables
v <- 'Im global variable'
stuff <- 'Im global stuff'
fun  <- function(stuff){
  print(v)
  stuff <- 'Reasssign a new stuff value'
  print(stuff)
}
print(v)
print(stuff)
fun(stuff)
print(stuff)

amt <- function(x=100){
  t = x+x*(0.2)
  return(t)
}
amt(100)
amt(9840)

amount <-function(amt){
  if(amt>0) famt = amt+amt*(0.2)
  if(amt<=0) famt = amt
  return(famt)
}
amount(670)

#Checking the argument and the body of a function
args(amount)
body(amount)


#Example to understand the scope 
f1 <- function(x){
  y = 10
  g1 = function(x){
    y+(x*x)
  }
  g1(x)
}
f1(10)

g2 <- function(x, y)
{
  y+(x*x)
}
f2 <- function(x)
{
  y = 10
  g2(x, y)
}
f2(10)
