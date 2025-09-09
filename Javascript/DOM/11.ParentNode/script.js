//! select the list item using data attribute
const selectedEl = document.querySelector("[data-item='fruit']");

//! Select the parent element
const parentEl = selectedEl.parentNode;

//! select the grandparent element
const grandParentEl = parentEl.parentNode;

//! select the greatgrandparent element
const greatGrandParent = grandParentEl.parentNode;