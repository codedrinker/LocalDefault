$('document').ready(function () {

    $('#dataList').datagrid({
        striped: true,
        singleSelect: true,
        idField: 'id',
        showFooter: false,
        width: 'auto',
        method: 'GET',
        rownumbers: true,
        pageSize: 20,
        pagination: true,
        onLoadError: function () {
            common.logout();
        },
        height: $(document).height() - 6,
        queryParams: {},
        loadMsg: 'loading...',
        url: 'admin/banner/listByClause',
        columns: [[{
            title: "Id",
            field: "id",
            width: 60,
            align: 'center'
        }, {
            title: "Title",
            field: "title",
            width: 150,
            align: 'center'
        }, {
            title: "Sub Title",
            field: "subTitle",
            width: 150,
            align: 'center'
        }, {
            title: "Action Type",
            field: "actionType",
            width: 100,
            align: 'center'
        }, {
            title: "Uri",
            field: "uri",
            width: 100,
            align: 'center'
        }, {
            title: "Publish Time",
            field: "publishTime",
            width: 120,
            align: 'center',
            formatter: function (value) {
                if (value == null) {
                    return null;
                } else {
                    return timeConverter(value);
                }
            }
        }, {
            title: "End Time",
            field: "endTime",
            width: 120,
            align: 'center',
            formatter: function (value) {
                if (value == null) {
                    return null;
                } else {
                    return timeConverter(value);
                }
            }
        }, {
            title: "Status",
            field: "status",
            width: 80,
            align: 'center',
            formatter: function (value) {
                if (value == 1) {
                    return "active";
                } else if (value == 0) {
                    return "inactive";
                } else {
                    return "unknown";
                }
            }
        }]]
        , frozenColumns: [[{
            title: "Options", field: "op", width: 200, align: 'center',
            formatter: function (value, row) {
                var del = '<a href="javascript:updateStatus(-1)">delete</a>';
                var update = '<a href="javascript:openUpdateBannerWin()">edit</a>';
                var addToFeed, btn;
                if (row["status"] == 0) {
                    btn = '<a href="javascript:updateStatus(1)">open</a>';
                } else {
                    addToFeed = '<a href="javascript:addToFeed()">add to feed</a>';
                    btn = '<a href="javascript:updateStatus(0)">close</a>';
                }
                return common.joinOptions(btn, del, update, addToFeed);
            }
        }]]
    });
});

function addToFeed() {
    var row = $('#dataList').datagrid('getSelected');
    if (row) {
        openDynamicWin('Add To Feed', "admin/feed/toAdd?materialId=" + row.id + "&materialType=" + common.MATERIAL_TYPES.MATERIAL_BANNER);
    }
}

function openUpdateBannerWin() {
    var row = $('#dataList').datagrid('getSelected');
    if (row) {
        openDynamicWin('Edit Banner', "admin/banner/toUpdateBanner?id=" + row.id);
    }
}

// ===============功能方法
/** 查询 */
function searchData() {
    $('#dataList').datagrid('clearSelections');
    $('#dataList').datagrid('load', {});
}

function updateStatus(status) {
    var row = $('#dataList').datagrid('getSelected');
    service.checkRelation("admin/feed/check?id=" + row.id + "&type=" + common.MATERIAL_TYPES.MATERIAL_BANNER, cons.ACTION[status], function (r) {
        if (r) {
            xhr.POST("admin/banner/updateStatus", {"id": row["id"], "status": status});
        }
    });
}
