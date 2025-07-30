# This program takes a single number and calculates
# a value 10 times of it
a = 14
b = a*10
print(c(a, b))
# multiple line comments:
#   first select all lines you wnat to comment
#   ctrl+shift+c
# to clear the console, click on the console and ctrl+l
# to clear single variable from the r environment:
rm(a)
# to clear all variables from the r environment:
rm(list=ls())
save(a,file = "sess1.Rdata")# to save a single variable 'a'
# to save a full workspace with specified file name:
save(list=ls(all.names = TRUE),file = "sess1.Rdata")
save.image()# shortcut function to save the whole workspace
load(file = "sess1.Rdata")# tp load saved workspace

#Variables and data types
typeof(a)
is.character(a)
is.integer(a)
as.complex(a)
as.character(a)
is.complex(as.integer)
a = as.character(a)
as.numeric(a)
as.complex(2)
as.numeric(a)
s = 's'
as.numeric(s)

#Vectors - contains elements of same data type
x = c(2.3, 4.5, 6.7, 8.9)
print(x)

#List
id = c(1, 2, 3, 4)
emp.name = c("Man", "Rag", "Sha", "Din")
num.emp = 4
emp.list = list(id, emp.name, num.emp)
print(emp.list)

#access the elements of the list
emp.list = list("id" = id, "Names" = emp.name, "Total staff" = num.emp)
print(emp.list$Names)
print(emp.list[[1]])
print(emp.list[[2]])
print(emp.list[[1]][1])
print(emp.list[[2]][1])

emp.list["Total staff"] = 5 
emp.list[[2]][5] = "Nir"
emp.list[[1]][5] = 5
print(emp.list)

#concatenation of lists
emp.ages = list("ages" = c(23, 48, 54, 30, 32, 34))
emp.list = c(emp.list, emp.ages)
print(emp.list)
