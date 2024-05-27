function filterProducts(category) {
    var grids = document.querySelectorAll('.product-grid');
    grids.forEach(function(grid) {
        if (category === 'all') {
            grid.classList.add('active');
        } else {
            if (grid.classList.contains(category)) {
                grid.classList.add('active');
            } else {
                grid.classList.remove('active');
            }
        }
    });
}

// Inicializa la vista con todos los productos visibles
filterProducts('all');