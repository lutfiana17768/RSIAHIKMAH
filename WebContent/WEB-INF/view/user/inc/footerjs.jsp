<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

    <script type="text/javascript">

        // select 2 single
        $('.select2-single').select2({
            width: '100%'
        });

        $('.select2-multiple').select2({
            width: '100%'
        });
        $('.select2-multiple').on('select2:select', function (e) {
            var role = e.params.data.id
            var addInput = $('<input type="hidden">')
            addInput.attr('value', role)
            addInput.attr('class', 'form-roles')
            $('#userModel').append(addInput);
            renameSelect2()
        });

        $('.select2-multiple').on('select2:unselect', function (e) {
            var role = e.params.data.id
            console.log('event hapus', $('input[value=' + role + ']'))
            $('input[value=' + role + ']').remove();
            renameSelect2()
        });

        function renameSelect2() {
            var attrName = $('.select2-multiple').attr('data-name');
            if (attrName) {
                $('.form-roles').each(function (e, i) {
                    $(this).attr('name', attrName + '[' + e + '].role.roleID');
                });
            } else {
                console.log('error message: attirbute data-name is required');
            }
        }
        $('.change-password').click(function () {
            if ($('.form-update-password').hasClass('show')) {
                $('.form-update-password').removeClass('show');
                $('.form-update-password').find('input, select').each(function () {
                    $(this).attr('disabled', true);
                });
                $('.form-update-password').hide();
            } else {
                $('.form-update-password').addClass('show');
                $('.form-update-password').find('input, select').each(function () {
                    $(this).attr('disabled', false);
                });
                $('.form-update-password').show(500);
            }
        })
        $('.select2-multiple').each(function (e, i) {
            $(this).val().forEach(function (val, i) {
                var role = val
                var addInput = $('<input type="hidden">')
                addInput.attr('value', role)
                addInput.attr('class', 'form-roles')
                $('#userModel').append(addInput);
            })
        });
        renameSelect2()
    </script>