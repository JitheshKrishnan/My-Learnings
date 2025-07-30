clc;
clear all;
close all;
x = [
0 0 0 0 0 0 0 0;
0 0 0 1 1 0 0 0;
0 0 1 1 1 1 0 0;
0 1 1 1 1 1 1 0;
0 0 1 1 1 1 0 0;
0 0 0 1 1 0 0 0;
0 0 0 0 0 0 0 0;
];
y = [
0 0 0;
0 1 1;
0 0 1;
];
subplot(121);
imshow(x);
title('Original Image');
z = bwhitmiss(x,y);
subplot(122);
imshow(z);
title('Hit or Miss Transform');