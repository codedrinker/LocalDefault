def map = [:]
def a =  [:]

map."an identifier with a space and double quotes" = "ALLOWED"
map.'with-dash-signs-and-single-quotes' = "ALLOWED"

def Map getMap(Map args) {
    args."h" = "h"
    return args;
}