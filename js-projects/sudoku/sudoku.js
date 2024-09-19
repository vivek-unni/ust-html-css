function createSudoku(){
    var cell = [];
    var main_cell=[]
    var container = document.getElementById('sudoku-container'); // Ensure this element exists in your HTML
    for (var i = 1; i <= 9; i++) {
        cell[i] = [];
        main_cell[i] = document.createElement('div');
        main_cell[i].id = 'main-cell-' + i ;
        container.appendChild(main_cell[i])
        for (var j = 1; j <= 9; j++) {
            cell[i][j] = document.createElement('div');
            cell[i][j].id = 'cell-' + i + '-' + j;
            cell[i][j].textContent = j;
            main_cell[i].appendChild(cell[+i][j])
        }
        container.appendChild(document.createElement('br'));
    }
}

createSudoku();