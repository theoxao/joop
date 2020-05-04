(function () {
    $(function () {

        let commitSize = 50;
        let branch = "jooq-ext";
        let tagOnly = false;
        const currentSelect = $('.current-select')
        const targetSelect = $('.target-select')
        const currentDisplay = $(".current-select-display")
        const targetDisplay = $(".target-select-display")
        const generateBtn = $(".generate-ddl")
        const reverseBtn = $(".reverse-commits")
        const versionIdInput = $(".version-id-input")
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
                    current: currentDisplay.attr("value"),
                    target: targetDisplay.attr("value")
                },
                success: function (result) {
                    console.log(result)
                }
            });
        })

        reverseBtn.on("click", function () {
            let tmpValue = currentDisplay.attr("value")
            let tmpEl = currentDisplay.html()
            currentDisplay.attr("value", targetDisplay.attr("value"))
            currentDisplay.html(targetDisplay.html())
            targetDisplay.attr("value", tmpValue)
            targetDisplay.html(tmpEl)
        })

        versionIdInput.on("blur", function () {
            let value = versionIdInput.val()
            if (value == null || value.length !== 17 || value.indexOf("-") === -1) {
                console.assert("version id error")
                return;
            }
            $.ajax({
                url: '/version/decode',
                dataType: 'json',
                type: 'get',
                data: {versionId: value},
                success: function (result) {
                    console.log(result)
                }
            });
        })

        let loadCommits = function loadCommits() {
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
