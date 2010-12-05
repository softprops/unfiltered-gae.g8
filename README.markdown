A [giter8][g8] template for [Google App Engine][gae] [Unfiltered][unfiltered] applications.

## install

    # download and copy google app engines sdk to /path/to/your/gae-home
    g8 softprops/unfiltered-gae
    export APPENGINE_SDK_HOME=/path/to/your/gae-home
    cd your-app && sbt update dev-appserver-start
 
point your browse at http://localhost:8080/

## TODO

* yaml configs - http://code.google.com/appengine/docs/java/configyaml/appconfig_yaml.html

[g8]: http://github.com/n8han/giter8#readme
[unfiltered]: http://github.com/n8han/unfiltered#readme
[gae]: http://code.google.com/appengine/