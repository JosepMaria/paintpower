/*Per canviar idioma*/
function canviIdioma(idioma) {
  document.getElementById("idioma").textContent = idioma;
}

/*Per al owl-carousel dels productes novetats */
$(document).ready(function() {
  var owl_novetats = $("#owl-novetats");
  owl_novetats.owlCarousel();

	$(".next-owl-novetats").on('click',function(){
	   owl_novetats.trigger('next.owl');
	})
	$(".prev-owl-novetats").on('click',function(){
	   owl_novetats.trigger('prev.owl');
	})
});

$('#owl-novetats').owlCarousel({
	loop:true,
	margin:1,
	nav:false,
	dots:false,
	responsive:{
			0:{
					items:1
			},
			600:{
					items:3
			},
			1000:{
					items:5
			}
	}
});

/*Per al owl-carousel dels productes destacats */
$(document).ready(function() {
  var owl_destacats = $("#owl-destacats");
  owl_destacats.owlCarousel();

	$(".next-owl-destacats").on('click',function(){
	   owl_destacats.trigger('next.owl');
	})
	$(".prev-owl-destacats").on('click',function(){
	   owl_destacats.trigger('prev.owl');
	})
});

$('#owl-destacats').owlCarousel({
	loop:true,
	margin:1,
	nav:false,
	dots:false,
	responsive:{
			0:{
					items:1
			},
			600:{
					items:3
			},
			1000:{
					items:5
			}
	}
});


/*$(function () {
  $('[data-toggle="tooltip"]').tooltip()
})
S'ha de ficar amb trigger hover perque sinó continua el missatge despres
de fer clic i no desapareix al missatge que surt al hover de les icones
de cada card
*/
  $('[data-toggle="tooltip"]').tooltip({
      trigger : 'hover'
  })
