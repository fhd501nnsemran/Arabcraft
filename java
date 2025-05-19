<section class="custom-order">
  <h2>اطلب الآن</h2>
  <label for="type">اختر نوع الشراء:</label>
  <select id="type">
    <option value="رتبة">رتبة</option>
    <option value="عملة">عملة</option>
  </select>

  <label for="item">اختر:</label>
  <select id="item">
    <!-- يتم تعبئتها ديناميكيًا -->
  </select>

  <button onclick="generateWhatsAppLink()">اطلب عبر واتساب</button>
</section>

<script>
  const items = {
    "رتبة": ["VIP", "MVP", "LEGEND"],
    "عملة": ["1,000,000", "2,000,000", "3,000,000"]
  };

  const typeSelect = document.getElementById('type');
  const itemSelect = document.getElementById('item');

  function updateItems() {
    const selectedType = typeSelect.value;
    itemSelect.innerHTML = '';
    items[selectedType].forEach(item => {
      const option = document.createElement('option');
      option.value = item;
      option.textContent = item;
      itemSelect.appendChild(option);
    });
  }

  typeSelect.addEventListener('change', updateItems);
  updateItems();

  function generateWhatsAppLink() {
    const type = typeSelect.value;
    const item = itemSelect.value;
    const number = '966549227425'; // رقم واتساب
    const message = `أرغب في شراء ${item} ${type}`;
    const link = `https://wa.me/${number}?text=${encodeURIComponent(message)}`;
    window.open(link, '_blank');
  }
</script>
