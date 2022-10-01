/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
const bar02 = document.querySelectorAll(".bar01 .bar04");
const contents = document.querySelectorAll(".bar01.accountinfo");

const removeActiveClass = () => {
  bar02.forEach((t) => {
    t.classList.remove("active");
  });

  contents.forEach((c) => {
    c.classList.remove("active");
  });
};

bar02.forEach((t, i) => {
  t.addEventListener("click", () => {
    removeActiveClass();
    contents[i].classList.add("active");
    t.classList.add("active");
  });
});

