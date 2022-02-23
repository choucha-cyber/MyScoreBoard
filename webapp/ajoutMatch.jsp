
<c:import url="nav/header.jsp"></c:import>

<h2>Ajout Match</h2>
<%--association jeu /joueur --%>


<form method="post" action="<%= request.getContextPath() %>/Match">
  <div class="mb-3">
    <label for="game_id" class="form-label">Nom du jeu</label>
    <input type="text" class="form-control" id="game_id" name="game_id">
  </div>
  <div class="mb-3">
    <label for="start_date" class="form-label">Date début du jeu</label>
    <input type="text" class="form-control" id="start_date" name="start_date">
  </div>
  <div class="mb-3">
    <label for="winner_id" class="form-label">Nom gagnant</label>
    <input type="text" class="form-control" id="winner_id" name="winner_id">
  </div>

  <button type="submit" class="btn btn-primary">ajout match</button>
</form>

     


<c:import url="nav/footer.jsp"></c:import>