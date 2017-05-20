DIR='Users/spencerleal/Documents/geektool/';
[ ! -f ${DIR}ImageEditor.class ] && javac ${DIR}ImageEditor.java;
java -classpath ${DIR} ImageEditor ${DIR}
