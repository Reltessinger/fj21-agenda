<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

	<c:import url="cabecalho.jsp"/>
	<table>
		<thead>
			<tr>
				<td>ID</td>
				<td>Nome</td>
				<td>Email</td>
				<td>Endereço</td>
				<td>Data Nascimento</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${contatos}" var="contato" varStatus="id">
				<tr bgcolor="#${id.count % 2 == 0 ? 'aaee88' : 'ffffff' }">
					<td>${id.count}</td>
					<td>${contato.nome}</td>
					<td>
						<c:choose>
							<c:when test="${not empty contato.email }">
								<a href="mailto:${contato.email }">${contato.email}</a>
							</c:when>
							<c:otherwise>
								Email não Informado
							</c:otherwise>
						</c:choose>
					</td>
					<td>${contato.endereco}</td>
					<td>
						<fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy"/>
					</td>
					<td>
						<a href="mvc?logica=RemoveContatoLogic&id=${contato.id}">Remover</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<c:import url="rodape.jsp"/>