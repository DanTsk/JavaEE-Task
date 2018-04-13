<html>
    <head>
        <title>
            AJAX Example
        </title>
    </head>

    <body>
    <h2>AJAX</h2>

    <section>
        <div id="pib"> Nothing to show for now </div>
        <form id="find">
            <input type="text" name="id" placeholder="Student Id" />

            <button type="submit"> Find </button>
        </form>
    </section>

    <section>
        <form id="create">
            <input type="text" name="pib" placeholder="Student Pib" />

            <input type="number" name="course" placeholder="Course"/>

            <button type="submit"> Create </button>
        </form>
    </section>

    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script>
        window.onload(() => {
            const findForm = $('#find');
            const createForm = $('#create');
            const display = $('#pib');

            findForm.onsubmit(e => {
               e.preventDefault();

               const id = findForm.find('input[name="id"]').val();
               $.get('/student/'+id, data => display.text(data.pib));

               return false;
            });


            createForm.onsubmit(e => {
               e.preventDefault();

               const pib = findForm.find('input[name="pib"]').val();
               const course = findForm.find('input[name="course"]').val();

               $.post(`/student/save`, { pib, course }, data => alert( data === true ? 'Created' : 'Error Occurred'));

               return false;
            });

        });
    </script>


    </body>
</html>
