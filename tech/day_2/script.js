
function getOrders() {
    // Store data
    const data = new Map();

    // Get orderer biodata
    const name = document.getElementById('name');
    data.set("Nama", name.value);
    const dob = document.getElementById('tanggal-lahir');
    data.set("dob",dob.value);
    const radio = document.querySelectorAll('input[name="who"]:checked');
    data.set("who", radio[0].value);

    // Get order
    const checkboxes = document.querySelectorAll('input[type="checkbox"]:checked');
    let ordered = {};
    checkboxes.forEach((check) => {
      let numOrder = check.name.substring(6);
      const tipeBarang = document.getElementById(`tipe_${numOrder}`).value;
      const merkBarang = document.getElementById(`merk_${numOrder}`).value;
      let detailOrder = {numOrder: {tipeBarang, merkBarang}};
      ordered[check.value] = detailOrder;
    });
    data.set("order", ordered);
    console.log(data);
  }

  let no_order = 0;
  function addCheckbox() {
    // Get form 
    const form = document.getElementById('myOrder');
    no_order++;

    // Create checkbox
    const newCheckbox = document.createElement('input');
    newCheckbox.type = 'checkbox';
    newCheckbox.name = `order_${no_order}`;
    newCheckbox.value = `order_${no_order}`;
    newCheckbox.classList.add('option-checkbox');

    // Create first select
    const tipeBarang = document.createElement('select');
    tipeBarang.id = `tipe_${no_order}`;
    tipeBarang.name =  `tipe_${no_order}`;
    tipeBarang.addEventListener('change', function(){
      updateMerk(`tipe_${no_order}`, `merk_${no_order}`);
    });

    // First select properties
    const tipeBarangOption = ['Elektronik', 'Perabotan', 'Perhiasan', 'Pakaian'];
    tipeBarangOption.forEach(optionText => {
      const option = document.createElement('option');
      option.value = optionText;
      option.textContent = optionText;
      tipeBarang.appendChild(option);
    });

    // Empty first select
    const empty = document.createElement('option');
    empty.value = '';
    empty.disabled = true;
    empty.selected = true;
    empty.textContent = 'Pilih tipe barang';
    tipeBarang.appendChild(empty);

    // Create second select
    const merkBarang = document.createElement('select');
    merkBarang.id = `merk_${no_order}`;
    merkBarang.name = `merk_${no_order}`;

    // Append all child
    form.appendChild(newCheckbox);
    form.appendChild(tipeBarang);
    form.appendChild(merkBarang);
    form.appendChild(document.createElement('br'));
  }

  function updateMerk(firstSelectId, secondSelectId){
    // Get DOM
    const tipeBarang = document.getElementById(firstSelectId);
    const merkBarang = document.getElementById(secondSelectId);
    merkBarang.innerHTML = '';

    // Second select properties
    let tipeOption;
    switch(tipeBarang.value){
      case 'Elektronik':
        tipeOption = ['Laptop', 'Televisi', 'Android', 'Iphone'];
        break;
      case 'Perabotan':
        tipeOption = ['Meja', 'Kursi', 'Kasur'];
        break;
      case 'Perhiasan':
        tipeOption = ['Kalung', 'Gelang', 'Cincin'];
        break;
      case 'Pakaian':
        tipeOption = ['Baju', 'Celana', 'Jaket', 'Jeans'];
        break;
      default:
        tipeOption = [];
        break;
    }

    // Add to child
    tipeOption.forEach(tipe => {
      const merkOption = document.createElement('option');
      merkOption.value = tipe;
      merkOption.textContent = tipe;
      merkBarang.appendChild(merkOption);
    });  
  }


