/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class Ou {
    private static final Logger b = Logger.getLogger(Ou.class);
    private static final String c = "content";
    private static final String d = ".";
    protected String a;
    private final EnumSet<Ow> e = EnumSet.noneOf(Ow.class);
    private final EnumMap<Ow, ResourceBundle> f = new EnumMap(Ow.class);

    public Set<Ow> a() {
        return Collections.unmodifiableSet(this.f.keySet());
    }

    public boolean a(Collection<Ow> collection) {
        this.e.addAll(collection);
        this.c();
        return collection.stream().allMatch(this.f::containsKey);
    }

    public boolean a(Ow ow) {
        this.e.add(ow);
        this.b(ow);
        return this.f.containsKey((Object)ow);
    }

    public void b() {
        this.e.clear();
        this.f.clear();
    }

    public void a(String string) {
        this.a = string;
        this.c();
    }

    public boolean a(Ow ow, String string) {
        try {
            return this.f.get((Object)ow).containsKey(string);
        }
        catch (RuntimeException runtimeException) {
            b.warn((Object)("Unable to get value for language " + ow + " and key " + string), (Throwable)runtimeException);
            return false;
        }
    }

    protected void c() {
        this.f.clear();
        for (Ow ow : this.e) {
            this.b(ow);
        }
    }

    private void b(Ow ow) {
        ResourceBundle resourceBundle = this.b(ow.a().getLanguage());
        if (resourceBundle == null) {
            return;
        }
        this.f.put(ow, resourceBundle);
    }

    /*
     * Exception decompiling
     */
    @Nullable
    protected ResourceBundle b(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @NotNull
    public String a(Ow ow, String string, Object ... objectArray) {
        String string2 = this.b(ow, string);
        return Cr.a(string2, objectArray);
    }

    @NotNull
    public String b(Ow ow, @NotNull String string) {
        try {
            return this.f.get((Object)ow).getString(string);
        }
        catch (RuntimeException runtimeException) {
            b.warn((Object)("Unable to get value for key " + string));
            return "!" + string + "!";
        }
    }

    @NotNull
    public String a(Ow ow, int n, int n2) {
        return this.b(ow, Ou.a(n, n2));
    }

    @NotNull
    public String a(Ow ow, int n, long l, Object ... objectArray) {
        return this.a(ow, Ou.a(n, l), objectArray);
    }

    public boolean a(Ow ow, int n, long l) {
        return this.a(ow, Ou.a(n, l));
    }

    @Nullable
    public Map<Integer, String> a(Ow ow, int n) {
        if (!this.f.containsKey((Object)ow)) {
            return null;
        }
        ResourceBundle resourceBundle = this.f.get((Object)ow);
        String string = Ou.a(n);
        Set set = resourceBundle.keySet().stream().filter(string2 -> string2.startsWith(string)).collect(Collectors.toSet());
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        int n2 = string.length();
        for (String string3 : set) {
            int n3 = Integer.parseInt(string3.substring(n2));
            String string4 = resourceBundle.getString(string3);
            hashMap.put(n3, string4);
        }
        return hashMap;
    }

    private static String a(int n) {
        return "content." + n;
    }

    private static String a(int n, long l) {
        return "content." + n + d + l;
    }

    public String toString() {
        return "SingleLanguageTranslator{m_path='" + this.a + "', m_languages=" + this.f.keySet().stream().map(Ow::h).collect(Collectors.joining(";")) + "}";
    }
}

