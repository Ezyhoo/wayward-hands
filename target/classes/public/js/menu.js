window.onload = (function(){
    $("#start-btn").click(function(){
        $(this).hide();
        $("#myCanvas").show();
        myMenu.start();
    });
    $("#start-game-btn").click(function(){
        myCanvas.hideMenu();
        myTable.start();
        setUpGame();
    })
    $("#back-btn").click(function(){
        myCanvas.hideTable();
        myMenu.start();
    })
    $("#raise-btn").click(function(){
        allPlayers[0].cards[0] = null;
    })

})
var myCanvas = {
    context: document.getElementById("myCanvas").getContext("2d"),
    width: 1352,
    height: 676,
    canvasBG: null,
    hideMenu: function(){
        $("#start-game-btn").hide();
        $("#setting-btn").hide();
    },
    showMenu: function(){
        $("#start-game-btn").show();
        $("#setting-btn").show();
        this.canvasBG = null;
        this.canvasBG = new Image();
        this.canvasBG.src = "images/WHMenu.png";
        this.context.drawImage(this.canvasBG, 0, 0);
        $("#back-btn").hide();
        },
    hideTable: function(){
        $("#game-info").hide();
        $("#my-info").hide();
        $("#AI1-info").hide();
        $("#AI2-info").hide();
        $("#AI3-info").hide();
        $("#AI4-info").hide();
        $("#AI5-info").hide();
        $("#raise-input").hide();
        $("#raise-btn").hide();
        $("#fold-btn").hide();
        $("#call-btn").hide();
        $("#all-in-btn").hide();
        $("#check-btn").hide();
    },
    showTable: function(){
        $("#game-info").show();
        $("#my-info").show();
        $("#AI1-info").show();
        $("#AI2-info").show();
        $("#AI3-info").show();
        $("#AI4-info").show();
        $("#AI5-info").show();
        $("#playerCard1").show();
        $("#playerCard2").show();
        $("#AI1Card1").show();
        $("#AI1Card2").show();
        $("#AI2Card1").show();
        $("#AI2Card2").show();
        $("#AI3Card1").show();
        $("#AI3Card2").show();
        $("#AI4Card1").show();
        $("#AI4Card2").show();
        $("#AI5Card1").show();
        $("#AI5Card2").show();
        $("#poolCard1").show();
        $("#poolCard2").show();
        $("#poolCard3").show();
        $("#poolCard4").show();
        $("#poolCard5").show();

        $("#raise-input").show();
        $("#raise-btn").show();
        $("#fold-btn").show();
        $("#call-btn").show();
        $("#all-in-btn").show();
        $("#check-btn").show();
        this.canvasBG = null;
        this.canvasBG = new Image();
        this.canvasBG.src = "images/tableBG.png";
        this.context.drawImage(this.canvasBG, 0, 0);
        $("#back-btn").show();
    },
    poolCards: [],



}
const cardWidth = 70;
const cardHeight = 100;
var allPlayers = [];

class player{
    cards = [];
    cash = 0;
    currentBet = 0;
    isSurvival = false;

    constructor(card1, card2){
        this.cards.push(card1);
        this.cards.push(card2);
    }

    displayCards(imgID1, imgID2){
        $('#'+imgID1)[0].src = "images/cardImages/";
        $('#'+imgID1)[0].src += this.cards[0];
        $('#'+imgID1)[0].src += ".png";

        $('#'+imgID2)[0].src = "images/cardImages/";
        $('#'+imgID2)[0].src += this.cards[1];
        $('#'+imgID2)[0].src += ".png";
    }
    reset(){
        this.cash = 0;
        this.currentBet = 0;
        this.isSurvival = false;
        allPlayers = {};
    }

}

class myPlayer extends player{

    constructor(card1Val, card2Val){
        super(card1Val,card2Val);

    }
}

class AI1 extends player{

    constructor(card1Val, card2Val){
        super(card1Val, card2Val);
    }
}

class AI2 extends player{

    constructor(card1Val, card2Val){
        super(card1Val, card2Val);
    }
}

class AI3 extends player{

    constructor(card1Val, card2Val){
        super(card1Val, card2Val);
    }
}

class AI4 extends player{

    constructor(card1Val, card2Val){
        super(card1Val, card2Val);
    }
}

class AI5 extends player{

    constructor(card1Val, card2Val){
        super(card1Val, card2Val);
    }
}

var myMenu = {
    start: function(){
        myCanvas.showMenu();
    },
}

var myTable = {
    start: function(){
        myCanvas.showTable();
    }
}


function setUpGame(){
    $.get("/setUp", function(data) {
        console.log(data);
        allPlayers.push(new myPlayer(data[0],data[1]));    // my player
        allPlayers.push(new AI1(data[2],data[3]));
        allPlayers.push(new AI2(data[4],data[5]));
        allPlayers.push(new AI3(data[6],data[7]));
        allPlayers.push(new AI4(data[8],data[9]));
        allPlayers.push(new AI5(data[10],data[11]));
        const cards = [data[12],data[13],data[14],data[15],data[16]];
        myCanvas.poolCards = cards;

        allPlayers[0].displayCards("playerCard1","playerCard2");

    }, "json");
}
