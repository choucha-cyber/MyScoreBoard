<c:import url="nav/header.jsp"></c:import>

<h2>Ajout Jeu</h2>

<form method="post" action="<%= request.getContextPath() %>/Jeu">
  <div class="mb-3">
    <label for="title" class="form-label">Titre</label>
    <input type="text" class="form-control" id="title" name="title">
  </div>
  <div class="mb-3">
    <label for="min_players" class="form-label">Nombre Joueurs minimum</label>
    <input type="number" class="form-control" id="min_players" name="min_players">
  </div>
  <div class="mb-3">
    <label for="max_players" class="form-label">Nombre Joueurs maximum</label>
    <input type="number" class="form-control" id="max_players" name="max_players">
  </div>

  <button type="submit" class="btn btn-primary">ajout jeu</button>
</form>

<c:import url="nav/footer.jsp"></c:import>