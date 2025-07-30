clc;
clear all;
close all;
a=imread('mrit.jpg');
[m n]=size(a);
f=fft2(a);
f_shift=fftshift(f);
p=m/2;
q=n/2;
d0=80;
d=sqrt((i-p)^2+(j-p)^2);
for i=1:m
    for j=1:n
        filter=(1/(1+(d/d0).^2));
    end
end
filter_apply=f_shift*filter;
k=ifftshift(filter_apply);
n=abs(ifft2(k));
subplot(221);
imshow(a);
title('original image');
subplot(222);
imshow(n);
title('butter worth lowpass');
a=imread('fundus.jpg');
[m n]=size(a);
f=fft2(a);

f_shift=fftshift(f);
p=m/2;
q=n/2;
d0=3000;
d=sqrt((i-p)^2+(j-p)^2);
for i=1:m
    for j=1:n
        filter(i,j)=exp(-(d)^2/(2*(d0)^2));
    end
end
filter_apply=f_shift*filter(i,j);
s=ifftshift(filter_apply);
h=abs(ifft2(s));
subplot(223);
imshow(h);
title('gaussian filter');
a=imread('fundus.jpg');
[m n]=size(a);
f=fft2(a);
f_shift=fftshift(f);
p=m/2;
q=n/2;
d0=80;
for i=1:m
    for j=1:n
        d=sqrt((i-p).^2+(j-q).^2);
        if d<=d0
            h(i,j)=1;
        else
            h(i,j)=0;
        end
    end
end
filter_apply=f_shift.*d;

u=ifftshift(filter_apply);
i=abs(ifft2(u));
subplot(224);
imshow(i);
title('ideal low pass');