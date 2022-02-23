<c:import url="nav/header.jsp"></c:import>
<h2>Ajout Joueur</h2>

<form method="post" action="<%= request.getContextPath() %>/Joueur">
  <div class="mb-3">
    <label for="email" class="form-label">Email</label>
    <input type="email" class="form-control" id="email" name="email">
  </div>
  <div class="mb-3">
    <label for="nickname" class="form-label">Surnom</label>
    <input type="text" class="form-control" id="nickname" name="nickname">
  </div>

  <button type="submit" class="btn btn-primary">créer joueur</button>
</form>
<c:import url="nav/footer.jsp"></c:import>