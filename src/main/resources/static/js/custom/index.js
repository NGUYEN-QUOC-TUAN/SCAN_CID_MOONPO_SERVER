function showDeleteId(button) {
    var employeeId = button.getAttribute("data-employee-id");
    alert("ID of employee: " + employeeId);
    var xhr = new XMLHttpRequest();
    xhr.open("DELETE", "/employee/delete/" + employeeId, true);
    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4) {
            if (xhr.status === 200) {
                alert("Employee deleted successfully");
                window.location.reload();
            } else {
                alert("Employee not found");
            }
        }
    };
    xhr.send();
}