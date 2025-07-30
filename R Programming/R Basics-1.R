#Variables

x <- 2
x
typeof(x)
class(x)
animal <- 'tiger'
animal
typeof(animal)
class(animal)
first_program <- 'variables'
first_program
typeof(first_program)
class(first_program)
program <- 'Hello World!'
program
typeof(program)
class(program)

#Data Types
x <- 100
typeof(x)
x <- 100L
typeof(x)
class(x)
x <- TRUE
typeof(x)
x <- 3 + 2i
x
typeof(x)
class(x)

#Arithmetic Oprerations

100 + 50
100 - 90
100 * 8
100/5
100%%3
34+46/2
(24+46)/2

x <- 100
y <- 200
x - y
x == y
x > y
x < y

#Loading datasets

Heart <- read.csv("C:\\Users\\Radhakrishnan P\\Downloads\\Heart.csv")
Heart
View(Heart)
x <- Heart[Heart$ChestPain == 'typical' & Heart$RestBP == 145,]
x
x <- Heart[Heart$ChestPain == 'typical' | Heart$RestBP == 145,]
x
View(airquality)
head(Heart)
tail(Heart)
x <- Heart[Heart$ChestPain=='typical' & Heart$Slope==3,]
x
View(x)
x <- 10
x
print(x)
print(paste('Hello', 'World'))
print(paste('Hello', 'World', sep = '-'))
print(paste0('Hello', 'World'))
print(paste0('Welcome', 'to', 'R'))
paste0('Welcome ', 'to', ' R')
paste('Hello', 'World')
x <- 10:20
typeof(x)
class(x)
print(x)
class(x)
34-65
34+90
56*8
60/7
60/10
70%%4
2^20
sc = 90
cp = 70
profit = sc - cp
print(profit)
paste(profit)
paste0(profit)
x <- 'Hello'
print(x)
length(x)
print(length(x))
x <- airquality
print(x)
sprintf('%s is %f feet tall', 'Ash', 5)
a <- c(1,2,3,4,5)
b <- c('red', 'green', 'blue')
print(a)
print(b)
typeof(a)
typeof(b)
class(a)
class(b)
Inf
1/Inf
#Inf means infinity
x <- vector('numeric', length = 10)
print(x)
x <- c(1,2,3,4,5)
c <- c(x,b)
print(c)
class(c)
typeof(c)
x <- 1:10
x
x <- c(21:30, 3)
x
ltrs <- letters[1:10]
ltrs
fac <- as.factor(ltrs)
fac
class(fac)
typeof(fac)
fac = as.factor(x)
fac
typeof(fac)
class(x)
x <- 0:9
x
class(x)
as.numeric(x)
as.logical(x)
as.character(x)
as.complex(x)
x <- 1
attributes(x)
x <- read.csv("C:\\Users\\Radhakrishnan P\\Downloads\\Heart.csv")
attributes(x)
test <- c('music tracks', 100, 5)
test
test <- list('music tracks', 100, 5)
test
is.list(test)
names(test) <- c('products', 'count', 'rating')
test
test[[1]]
test[[2]]
test[[3]]
prod <- list(name = 'jk', rn = 101, ht = 131)
prod
str(test)
str(prod)
v <- list(x = c(1,2,3), y = c('r','g','b'), z = c(1,0,1))
v
str(v)
prod <- list(name = 'jk', rn = 101, ht = 131, new = test)
prod
v[[1]]
v[1]
v['x']
v[c(FALSE, FALSE, FALSE)]
v
v$y
x <- matrix(1:9, nrow = 3)
x
x <- matrix(1:12, nrow = 4, byrow = FALSE)
x
x <- matrix(1:3, nrow = 2, ncol = 3, byrow = FALSE)
x
x <- matrix(1:4, nrow = 2, ncol = 3, byrow = FALSE)
x
cbind(1:4:2, 1:3)
rbind(1:4, 1:3)
n <- matrix(1:6, byrow = TRUE, nrow = 2)
n
n = rbind(n, 7:9)
n
cbind(n, 10:12)
n
rownames(n) <- c('row1', 'row2', 'row3')
n
colnames(n) <- c('col1', 'col2', 'col3')
n
l <- matrix(LETTERS[1:12], nrow = 4, ncol = 3)
l
n
rbind(l, n)
name <- c('jk', 'ns', 'ma', 'vpn', 'pd')
age <- c(23,63,57,35,34)
nm <- c(TRUE, FALSE, TRUE, TRUE, FALSE)
df <- data.frame(name, age, nm)
df
df <- data.frame(Names = name, Age = age, Num = nm)
df
str(df)
df
df[3,2]
df[3, 'Age']
df[3,]
df[,3]
df[[3]]
df[3]
df['Num']
df$Num
df[c(3,5), c(1,2)]
height <- c(451,21,264,152,623)
df$Height <- height
df
weight <- c(12,52,45,85,62)
df[["Weight"]] <- weight
df
tom <- list("Tom", 34, TRUE, 356, 45)
rbind(df, tom)
sort(df$Age)
ranks <- order(df$Age)
ranks
df[ranks,]
df[order(df$Age, decreasing = FALSE),]
x <- c(1,2,3)
y <- c('r', 'g', 'b')
z <- c(TRUE, FALSE, TRUE)
x;y;z
x <- 1:20
x
x <- c(1:25)
x
x <- seq(1,20)
x
x <- seq(1,20,2)
x
x <- seq(2,20,2)
x
x <- seq(from = 21, by = 2, length.out = 10)
x
x <- seq(21,40,2)
x
x <- c(1,2,3,4,5)
names(x) <- c('a', 'b', 'c', 'd', 'e')
x
price <- seq(100,220,20)
names(price) <- paste0('p', 1:7)
price
v1 <- c(9,4,2)
v2 <- c(5,2,8)
v1+v2
v1-v2
v1*v2
v1/v2
sum(v1)
sd(v1)
var(v1)
prod(v1)
max(v1)
min(v1)
v1<v2
v1>v2
v1!=v2
v1==v2
v1 > 4
price
price[3]
price[3:4]
price[c(1,6)]
price[c('p3')]
price['p3']
price[c('p3','p4','p7')]
price[c(T,F,F,F,T,T,T)]
price[c(T,F)]
price[c(F,T)]
price[-2]
price[c(-3,-4)]
price[price>150]
filter <- price > 150
price[filter]
order <- c(10,20,30,NA,50,60)
order
names(order) <- c('mon', 'tue', 'wed', 'thu', 'fri', 'sat')
order
order + 5
order + c(5,10)
length(order)
l <- length(order)
order[(l-1):l]
order[(l-1):2]
order[l:1]
na.omit(order)
order
sum(order)
sum(order, na.rm=T)
max(order, na.rm=T)
min(order, na.rm=T)
mean(order, na.rm=T)
sd(order, na.rm=T)
var(order, na.rm=T)
prod(order, na.rm=T)
sqrt(order)

#matrix

v <- 10:20
v
matrix(v)
mat1 <- matrix(0,3,3)
mat1
mat2 <- matrix(1:9,3,3)
mat2
mat3 <- matrix(1:9, nrow = 3, byrow = T)
mat3
stock1 <- seq(1,5)
stock2 <- seq(6,10)
stock <- c(stock1, stock2)
stock
stock.matrix <- matrix(stock, nrow = 2, byrow = T)
stock.matrix
days <- c('mon', 'tue', 'wed', 'thu', 'fri')
stk <- c('stock1', 'stock2')
colnames(stock.matrix) <- days
rownames(stock.matrix) <- stk
stock.matrix
nrow(mat3)
ncol(mat3)
dim(mat3)
rownames(stock.matrix)
colnames(stock.matrix)
dimnames(stock.matrix)
mat1 <- matrix(1:50, byrow = T, nrow = 5)
mat1
mat1+5
5*mat1
mat1/5
mat1-6
mat1^2
2/mat1
mat1+mat1
mat1-mat1
mat1*mat1
colSums(stock.matrix)
rowSums(stock.matrix)
rowMeans(stock.matrix)
colMeans(stock.matrix)
stock3 <- c(11:15)
stock3
stock.matrix <- rbind(stock.matrix, stock3)
stock.matrix
avg <- rowMeans(stock.matrix)
avg
stock.matrix <- cbind(stock.matrix, avg)
stock.matrix

#Matrix selection and indexing

students <- matrix(c(17,48,63,NA,46,86,NA,72,68,27,36,NA,68,NA,48,97), nrow = 4, ncol = 4, byrow = T)
dimnames(students) <- list(c('john', 'mathew', 'helen', 'max'), c('phy', 'che', 'bio', 'math'))
students
mean(students[c('john'),],na.rm = T)
mean(students[c('john'),])
apply(students, 1, mean, na.rm = T)
apply(students, 2, mean, na.rm = T)
help(apply)
apply(students, 2, sum, na.rm = T)
passingscore <- c(25,25,25,70)
passingscore
johnpass <- (students['john',] > passingscore)
johnpass

# Data Sets

data()
data(iris)
head(iris)
View(iris)
summary(iris)
str(iris)

# try it someother time
help(subset)

#Merging Data Frames
authors <- data.frame(
  surname = I(c('Turkey', 'Venables', 'Tierney', 'Ripley', 'McNeil')),
  nationality = c('US', 'Australia', 'US', 'UK', 'Australia'),
  deceased = c('yes', rep('no', 4)))
authors
books = data.frame(
  name = I(c('Turkey', 'Venables', 'Tierney', 'Ripley', 'Ripley', 'McNeil', 'R Core')),
  title = c('EDA', 'MAS', 'LISP', 'SS', 'STS', 'IDA', 'ANIR'),
  other.author = c(NA, 'Ripley', NA, NA, NA, NA, 'Venables & Smith'))
authors
books
(m1 <- merge(authors, books, by.x = 'surname', by.y = 'name'))
salesreport <- data.frame(Id=101:110,
                          product=c('A','B'),
                          Unitprice=as.integer(runif(10,100,200)),
                          qty=as.integer(runif(10,10,20)))
salesreport
transpose.salesreport <- t(salesreport)
transpose.salesreport
View(transpose.salesreport)
head(transpose.salesreport)

#sorting a data  frame
salesreport[order(salesreport$Unitprice),]
salesreport[order(salesreport$Unitprice, decreasing = T),]

#subsetting data frame
subset.product <- subset(salesreport, product == 'A')
subset.product

#extract rows by filtering
subset.salesreport <- subset(salesreport, product == 'A' & Unitprice > 150)
subset.salesreport

aggregate(salesreport$qty, list(salesreport$product), sum, na.rm = T)

#Lists in R
list2 <- list(vec = seq(1:10),
              mat = matrix(1:9,3,3),
              lis = list(a = 10, b = 20))
list2
#Recursive Variable -> Variable that can store values of its own type
is.recursive(list2)

price <- c(10, 20, 30)
pricelist <- as.list(price)
pricelist
price

#Conversion of list to vector
newprice <- unlist(pricelist)
newprice

#Use dim fn to convert vectors to matrix
price1 <- c(10, 20, 30, 40)
dim(price1) <- c(2, 2)
price1

c1 <- 'John'
c2 <- 'Rob'
toupper(c1)
substr(c1, 1,3)
length(c1)
nchar(c2)
