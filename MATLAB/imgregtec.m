clc;
clear all;
close all;
fixed=imread('mrit.jpg');
fixed = imresize(fixed, [2000,2000])
moving=imread('mri.jpg');
figure(1);
imshowpair(fixed,moving,'montage');
title('Input image');
figure(2);
imshowpair(fixed,moving);
title('Image registration');
moving2=imhistmatch(moving,fixed);
[~,moving]=imregdemons(moving,fixed,[500 400 200],'accumulated add smoothing',1.3);
figure(3);
imshowpair(fixed,moving);
figure(4);
imshowpair(fixed,moving,'montage');
