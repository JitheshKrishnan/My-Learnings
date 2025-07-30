clc;
clear all;
close all;
a=imread('WhatsApp Image 2023-10-08 at 20.39.42.jpeg');
b=imresize(a,[256,256]);
subplot(221);
imshow(b);
title('Input image');
[col,row]=ginput(3);
c=col;
r=row;
cmask=roipoly(b,c,r);
subplot(222);
imshow(cmask);
title('Selected ROI');
ROI=zeros(256,256);
without_ROI=zeros(256,256);
for i=1:256
    for j=1:256
        if cmask(i,j)==1
            ROI(i,j)=b(i,j);
        else
            without_ROI(i,j)=b(i,j);
        end
    end
end
subplot(223);
imshow(ROI);
title('ROI');
subplot(224);
imshow(without_ROI);
title('Without ROI');
