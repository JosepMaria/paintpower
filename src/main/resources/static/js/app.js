
  var app = new Vue({
    el: "#register",
    data:{
        selected: false
    }
  });

  var vm = new Vue({
    el: '#color',
    data:{
      tamany: false,
      quantitat: '0',
      colour: 'transparent',
      mostrardetall: false,
      preu: 0,
      total: 0
    },
    methods:{
      /*S'ha de carregar despres de crear el DOM pq es pugui veure
      els missatges de colors a elements hidden inicialment*/
      carregarTooltip: function(){
        this.$nextTick(function() {
                $('[data-toggle="tooltip"]').tooltip()
            })
      },
      canviColorFons: function(bgc){
        this.colour = bgc;
      },
      calcularPreu: function(pr){
        if(this.quantitat == '...'){
          this.quantitat = 0;
        }
        if(typeof pr !== "undefined"){
            this.preu = pr;
        }
        this.total = this.preu * this.quantitat;
        this.total = this.total.toFixed(2);
      /*  alert(this.preu);
        alert(this.quantitat);
        alert(this.total);
        alert(this.total.toFixed(2));//fixa el resultat amb dos decimals en javascript*/
      },
      mostrarDetall: function(){

        if((this.quantitat != '...') && (this.tamany != '') && (this.colour != 'transparent')){
          this.mostrardetall = true;
        }
        /*var context = this;
        Vue.nextTick(function () {
          alert(context.quantitat);
        });*/
      },
    }
  });
