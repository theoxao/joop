(function () {
    $(function () {

        let commitSize = 50;
        let branch = "jooq-ext";
        let tagOnly = false;
        const currentSelect = $('.current-select')
        const targetSelect = $('.target-select')
        const currentDisplay = $(".current-select-display")
        const targetDisplay = $(".target-select-display")
        const generateBtn= $(".generate-ddl")
        $("[name='my-checkbox']").bootstrapSwitch(
            {
                onSwitchChange: function () {
                    tagOnly = !tagOnly
                    loadCommits()
                }
            }
        );

        generateBtn.on('click', function () {
            $.ajax({
                url: '/schema/generate',
                dataType: 'html',
                type: 'get',
                data: {
                    current:currentDisplay.attr("value"),
                    target:targetDisplay.attr("value")
                },
                success: function (result) {
                    console.log(result)
                }
            });
        })

        let loadCommits  = function loadCommits() {
            $.ajax({
                url: '/schema/commit_options',
                dataType: 'html',
                type: 'get',
                data: {
                    "branch": branch,
                    "tagOnly": tagOnly,
                    "size": commitSize
                },
                success: function (result) {
                    currentSelect.empty();
                    targetSelect.empty();
                    currentSelect.append(result);
                    targetSelect.append(result);
                    currentSelect.on('click' , '.commit-option', function(){
                        currentDisplay.attr("value", $(this).attr("value"))
                        currentDisplay.html($(this).html())
                    })
                    targetSelect.on('click' , '.commit-option', function(){
                        targetDisplay.attr("value", $(this).attr("value"))
                        targetDisplay.html($(this).html())
                    })
                }
            });
        };
        loadCommits()

    });
})();
