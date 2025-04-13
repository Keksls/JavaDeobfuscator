/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import org.apache.log4j.Logger;

/*
 * Renamed from aoj
 */
public class aoj_2 {
    private static final boolean b = false;
    protected static final Logger a = Logger.getLogger(aoj_2.class);
    private static final aoj_2 c;
    private static final ArrayList<ArrayList<Enum>> d;
    private static int[][] e;
    private static HashMap<Enum, ArrayList<Enum>> f;
    private static HashMap<Enum, ArrayList<Enum>> g;
    private static boolean h;
    private static final int i = -5;
    private static final int j = -1;

    public static aoj_2 a() {
        return c;
    }

    public void b() {
        if (h) {
            throw new aoh_1("Tentative d'initialisation de la table d'analyse syntaxique alors qu'elle est d\u00e9j\u00e0 initialis\u00e9e");
        }
        this.d();
        for (aok_1 aok_12 : aok_1.values()) {
            f.put(aok_12, this.a(aok_12));
        }
        for (aok_1 aok_12 : aok_1.values()) {
            g.put(aok_12, new ArrayList());
        }
        this.g();
        e = new int[aok_1.values().length][aon_1.values().length];
        this.f();
        h = true;
        a.info((Object)"[Analyse Syntaxique des Crit\u00e8res] Analyseur Syntaxique initialis\u00e9.");
    }

    private void d() {
        this.a(aok_1.h, new Enum[]{aok_1.a, aon_1.l});
        this.a(aok_1.b, new Enum[]{aon_1.j, aok_1.a});
        this.a(aok_1.b, new Enum[]{aon_1.a, aok_1.a});
        this.a(aok_1.f, new Enum[]{aon_1.j, aok_1.f});
        this.a(aok_1.f, new Enum[]{aon_1.b, aok_1.f});
        this.a(aok_1.a, new Enum[]{aok_1.f, aok_1.b});
        this.a(aok_1.b, new Enum[]{aon_1.k});
        this.a(aok_1.f, new Enum[]{aon_1.g});
        this.a(aok_1.f, new Enum[]{aon_1.i});
        this.a(aok_1.f, new Enum[]{aon_1.h});
        this.a(aok_1.f, new Enum[]{aon_1.c, aon_1.e, aok_1.c, aon_1.f});
        this.a(aok_1.f, new Enum[]{aon_1.e, aok_1.a, aon_1.f});
        this.a(aok_1.c, new Enum[]{aok_1.d});
        this.a(aok_1.c, new Enum[]{aon_1.k});
        this.a(aok_1.d, new Enum[]{aok_1.a, aok_1.e});
        this.a(aok_1.e, new Enum[]{aon_1.d, aok_1.d});
        this.a(aok_1.e, new Enum[]{aon_1.k});
    }

    private void a(aok_1 aok_12, Enum[] enumArray) {
        ArrayList<Enum> arrayList = new ArrayList<Enum>();
        arrayList.add(aok_12);
        for (Enum enum_ : enumArray) {
            if (!(enum_ instanceof aon_1) && !(enum_ instanceof aok_1)) {
                throw new aoh_1("Erreur d'ans l'ajout d'une r\u00e8gle dans la table d'analyse syntaxique - Element de type inattendu");
            }
            arrayList.add(enum_);
        }
        d.add(arrayList);
    }

    private String e() {
        Object object = "/**** Grammaire reconnue ****/\n";
        for (ArrayList<Enum> arrayList : d) {
            for (int k = 0; k < arrayList.size(); ++k) {
                object = (String)object + arrayList.get(k).name();
                object = k == 0 ? (String)object + " -> " : (String)object + " ";
            }
            object = (String)object + "\n";
        }
        return object;
    }

    private void f() {
        this.h();
        for (int k = 0; k < d.size(); ++k) {
            ArrayList arrayList;
            ArrayList<Enum> arrayList2 = d.get(k);
            if (arrayList2.get(1) instanceof aon_1 && !arrayList2.get(1).equals((Object)aon_1.k)) {
                if (e[arrayList2.get(0).ordinal()][arrayList2.get(1).ordinal()] != -1) {
                    aoj_2.e[arrayList2.get((int)0).ordinal()][arrayList2.get((int)1).ordinal()] = -2;
                    h = false;
                    throw new aoh_1("Cr\u00e9ation d'une table d'analyse \u00e0 partir d'une grammaire ambig\u00fce - Verifiez ou modifiez la grammaire");
                }
                aoj_2.e[arrayList2.get((int)0).ordinal()][arrayList2.get((int)1).ordinal()] = k;
                continue;
            }
            if (arrayList2.get(1) instanceof aok_1) {
                Object object2;
                arrayList = (ArrayList)f.get(arrayList2.get(1)).clone();
                for (Object object2 : arrayList) {
                    if (!(object2 instanceof aon_1) || ((Enum)object2).equals((Object)aon_1.k)) continue;
                    if (e[arrayList2.get(0).ordinal()][((Enum)object2).ordinal()] != -1) {
                        aoj_2.e[arrayList2.get((int)0).ordinal()][((Enum)object2).ordinal()] = -2;
                        h = false;
                        throw new aoh_1("Cr\u00e9ation d'une table d'analyse \u00e0 partir d'une grammaire ambig\u00fce - Verifiez ou modifiez la grammaire");
                    }
                    aoj_2.e[arrayList2.get((int)0).ordinal()][((Enum)object2).ordinal()] = k;
                }
                if (!arrayList.contains((Object)aon_1.k)) continue;
                ArrayList arrayList3 = (ArrayList)g.get(arrayList2.get(0)).clone();
                object2 = arrayList3.iterator();
                while (object2.hasNext()) {
                    Enum enum_ = (Enum)object2.next();
                    if (!(enum_ instanceof aon_1) || enum_.equals((Object)aon_1.k)) continue;
                    if (e[arrayList2.get(0).ordinal()][enum_.ordinal()] != -1) {
                        aoj_2.e[arrayList2.get((int)0).ordinal()][enum_.ordinal()] = -2;
                        h = false;
                        throw new aoh_1("Cr\u00e9ation d'une table d'analyse \u00e0 partir d'une grammaire ambig\u00fce - Verifiez ou modifiez la grammaire");
                    }
                    aoj_2.e[arrayList2.get((int)0).ordinal()][enum_.ordinal()] = k;
                }
                continue;
            }
            if (!arrayList2.get(1).equals((Object)aon_1.k)) continue;
            arrayList = (ArrayList)g.get(arrayList2.get(0)).clone();
            for (Object object2 : arrayList) {
                if (!(object2 instanceof aon_1) || ((Enum)object2).equals((Object)aon_1.k)) continue;
                if (e[arrayList2.get(0).ordinal()][((Enum)object2).ordinal()] != -1) {
                    aoj_2.e[arrayList2.get((int)0).ordinal()][((Enum)object2).ordinal()] = -2;
                    h = false;
                    throw new aoh_1("Cr\u00e9ation d'une table d'analyse \u00e0 partir d'une grammaire ambig\u00fce - Verifiez ou modifiez la grammaire");
                }
                aoj_2.e[arrayList2.get((int)0).ordinal()][((Enum)object2).ordinal()] = k;
            }
        }
        aoj_2.e[aok_1.i.ordinal()][aon_1.l.ordinal()] = -5;
    }

    private ArrayList<Enum> a(Enum enum_) {
        ArrayList<Enum> arrayList = new ArrayList<Enum>();
        if (enum_ instanceof aon_1) {
            if (!arrayList.contains(enum_)) {
                arrayList.add(enum_);
            }
            return arrayList;
        }
        if (enum_ instanceof aok_1) {
            for (ArrayList<Enum> arrayList2 : d) {
                if (!arrayList2.get(0).equals(enum_) || !((Enum)arrayList2.get(1)).equals((Object)aon_1.k) || arrayList.contains((Object)aon_1.k)) continue;
                arrayList.add(aon_1.k);
            }
            boolean bl = true;
            while (bl) {
                bl = false;
                block2: for (ArrayList arrayList3 : d) {
                    if (!((Enum)arrayList3.get(0)).equals(enum_)) continue;
                    int n = 1;
                    while (true) {
                        boolean bl2 = false;
                        ArrayList arrayList4 = (ArrayList)this.a((Enum)arrayList3.get(n)).clone();
                        if (arrayList4.contains((Object)aon_1.k)) {
                            bl2 = true;
                            arrayList4.remove((Object)aon_1.k);
                        }
                        for (Enum enum_2 : arrayList4) {
                            if (arrayList.contains(enum_2)) continue;
                            arrayList.add(enum_2);
                            bl = true;
                        }
                        if (!bl2) continue block2;
                        if (n == arrayList3.size() - 1) {
                            if (arrayList.contains((Object)aon_1.k)) continue block2;
                            arrayList.add(aon_1.k);
                            bl = true;
                            continue block2;
                        }
                        ++n;
                    }
                }
            }
        }
        return arrayList;
    }

    private boolean b(Enum enum_) {
        boolean bl = false;
        if (aok_1.h.equals(enum_) && !g.get(enum_).contains((Object)aon_1.l)) {
            g.get(enum_).add(aon_1.l);
            bl = true;
        }
        if (enum_ instanceof aok_1) {
            for (ArrayList<Enum> iterator : d) {
                for (int k = 2; k < iterator.size(); ++k) {
                    if (!iterator.get(k - 1).equals(enum_) || !(iterator.get(k) instanceof aon_1) || g.get(enum_).contains(iterator.get(k))) continue;
                    g.get(enum_).add(iterator.get(k));
                    bl = true;
                }
            }
        }
        if (enum_ instanceof aok_1) {
            boolean bl2 = true;
            while (bl2) {
                bl2 = false;
                for (ArrayList<Enum> arrayList : d) {
                    block4: for (int k = 2; k < arrayList.size(); ++k) {
                        if (!arrayList.get(k - 1).equals(enum_) || !(arrayList.get(k) instanceof aok_1)) continue;
                        int n = k;
                        while (true) {
                            Object object;
                            Object object2;
                            boolean bl3;
                            if (bl3 = ((ArrayList)(object2 = (ArrayList)f.get(arrayList.get(n)).clone())).contains((Object)aon_1.k)) {
                                ((ArrayList)object2).remove((Object)aon_1.k);
                            }
                            Object object3 = ((ArrayList)object2).iterator();
                            while (object3.hasNext()) {
                                object = (Enum)object3.next();
                                if (g.get(enum_).contains(object)) continue;
                                g.get(enum_).add((Enum)object);
                                bl2 = true;
                                bl = true;
                            }
                            if (!bl3) continue block4;
                            if (n == arrayList.size() - 1 && !arrayList.get(0).equals(enum_)) {
                                object3 = (ArrayList)g.get(arrayList.get(0)).clone();
                                object = ((ArrayList)object3).iterator();
                                while (object.hasNext()) {
                                    Enum enum_2 = (Enum)object.next();
                                    if (g.get(enum_).contains(enum_2)) continue;
                                    g.get(enum_).add(enum_2);
                                    bl2 = true;
                                    bl = true;
                                }
                                continue block4;
                            }
                            if (n == arrayList.size() - 1) continue block4;
                            ++n;
                        }
                    }
                }
                for (ArrayList<Enum> arrayList : d) {
                    if (!arrayList.get(arrayList.size() - 1).equals(enum_) || arrayList.get(0).equals(enum_)) continue;
                    ArrayList arrayList2 = (ArrayList)g.get(arrayList.get(0)).clone();
                    for (Object object2 : arrayList2) {
                        if (g.get(enum_).contains(object2)) continue;
                        g.get(enum_).add((Enum)object2);
                        bl2 = true;
                        bl = true;
                    }
                }
            }
        }
        return bl;
    }

    private void g() {
        int n;
        do {
            n = 0;
            for (aok_1 aok_12 : aok_1.values()) {
                if (this.b(aok_12)) continue;
                ++n;
            }
        } while (n != aok_1.values().length);
    }

    private void h() {
        h = false;
        for (int k = 0; k < e.length; ++k) {
            for (int i2 = 0; i2 < e[k].length; ++i2) {
                aoj_2.e[k][i2] = -1;
            }
        }
    }

    public String c() {
        Object object = "\n/**** Table d'analyse ****/\n\n";
        for (int k = 0; k < e.length; ++k) {
            object = (String)object + "| ";
            for (int i2 = 0; i2 < e[k].length; ++i2) {
                object = e[k][i2] >= 0 && e[k][i2] < 10 ? (String)object + " " + e[k][i2] : (e[k][i2] == -5 ? (String)object + "OK" : (e[k][i2] == -1 ? (String)object + "##" : (String)object + e[k][i2]));
                object = (String)object + " | ";
            }
            object = (String)object + "\n";
        }
        return object;
    }

    public static aom_2 a(List<apy_1> list) {
        aom_2 aom_22 = new aom_2();
        aom_2 aom_23 = new aom_2();
        ArrayList<apy_1> arrayList = new ArrayList<apy_1>();
        Stack<Enum> stack = new Stack<Enum>();
        list.add(new apv_1());
        stack.push(aok_1.i);
        stack.push(aok_1.a);
        int n = 0;
        Stack<Integer> stack2 = new Stack<Integer>();
        int n2 = 0;
        boolean bl = false;
        Stack<Object[]> stack3 = new Stack<Object[]>();
        block4: while (!stack.isEmpty() && n2 < list.size()) {
            if (list.get(n2).a().equals(stack.peek()) && !list.get(n2).a().equals((Object)aon_1.l)) {
                if (list.get(n2).a() instanceof aon_1) {
                    list.get(n2).a(n);
                }
                if (!stack2.isEmpty()) {
                    int n3 = (Integer)stack2.pop();
                    stack2.push(n3 - 1);
                    while (!stack2.isEmpty() && (Integer)stack2.peek() < 1) {
                        stack2.pop();
                        --n;
                    }
                }
                stack.pop();
                if (bl && list.get(++n2).a().equals((Object)aon_1.e)) {
                    Object[] objectArray = (Object[])stack3.pop();
                    objectArray[0] = (Integer)objectArray[0] + 1;
                    stack3.push(objectArray);
                    continue;
                }
                if (bl && list.get(n2).a().equals((Object)aon_1.f)) {
                    Object[] objectArray = (Object[])stack3.pop();
                    objectArray[0] = (Integer)objectArray[0] - 1;
                    if ((Integer)objectArray[0] == -1) {
                        if (!aom_22.a() || ((apm_2)objectArray[1]).d().size() != 0) {
                            ((apm_2)objectArray[1]).a(aom_22.j());
                        }
                        aom_22 = (aom_2)objectArray[2];
                        aom_23 = (aom_2)objectArray[3];
                    } else {
                        stack3.push(objectArray);
                    }
                    if (!stack3.isEmpty()) continue;
                    bl = false;
                    continue;
                }
                if (!bl || !list.get(n2).a().equals((Object)aon_1.d)) continue;
                Object[] objectArray = (Object[])stack3.pop();
                ((apm_2)objectArray[1]).a(aom_22.j());
                aom_22 = new aom_2();
                aom_23 = new aom_2();
                stack3.push(objectArray);
                continue;
            }
            switch (e[((Enum)stack.peek()).ordinal()][list.get(n2).a().ordinal()]) {
                case -5: {
                    stack.pop();
                    break block4;
                }
                case -1: {
                    throw new aoh_1("[Analyse syntaxique des crit\u00e8res]  Erreur de syntaxe");
                }
                default: {
                    int n4;
                    ArrayList<Enum> arrayList2 = null;
                    if (e[((Enum)stack.peek()).ordinal()][list.get(n2).a().ordinal()] == 1) {
                        arrayList2 = d.get(2);
                        list.remove(n2);
                        list.add(n2, new apa_1("-"));
                    } else if (e[((Enum)stack.peek()).ordinal()][list.get(n2).a().ordinal()] == 3) {
                        arrayList2 = d.get(4);
                        list.remove(n2);
                        list.add(n2, new apz_1("-"));
                    } else {
                        arrayList2 = d.get(e[((Enum)stack.peek()).ordinal()][list.get(n2).a().ordinal()]);
                    }
                    if (arrayList2.size() == 2 && arrayList2.get(1) == aon_1.k) {
                        if (!stack2.isEmpty()) {
                            n4 = (Integer)stack2.pop();
                            stack2.push(n4 - 1);
                            while (!stack2.isEmpty() && (Integer)stack2.peek() < 1) {
                                stack2.pop();
                                --n;
                            }
                        }
                        stack.pop();
                        continue block4;
                    }
                    if (!stack2.isEmpty()) {
                        n4 = (Integer)stack2.pop();
                        stack2.push(n4 - 1);
                    }
                    stack2.push(arrayList2.size() - 1);
                    ++n;
                    stack.pop();
                    for (n4 = arrayList2.size() - 1; n4 > 0; --n4) {
                        stack.push(arrayList2.get(n4));
                    }
                    if (arrayList.contains(list.get(n2))) continue block4;
                    arrayList.add(list.get(n2));
                    if (list.get(n2).a().equals((Object)aon_1.a) || list.get(n2).a().equals((Object)aon_1.b)) {
                        while (true) {
                            if (aom_22.a()) {
                                aom_22 = aom_23 = new aom_2(list.get(n2));
                                continue block4;
                            }
                            if (aom_23.g() == null && !aom_23.c() && !aom_23.d()) {
                                aom_23.a(new aom_2(list.get(n2)));
                                aom_23 = aom_23.g();
                                continue block4;
                            }
                            if (aom_23.f() == null && !aom_23.c()) {
                                aom_23.b(new aom_2(list.get(n2)));
                                aom_23 = aom_23.f();
                                continue block4;
                            }
                            if (aom_23.e().b() < n && !aom_23.c()) {
                                aom_23.b(new aom_2(list.get(n2), aom_23.f(), null));
                                aom_23 = aom_23.f();
                                continue block4;
                            }
                            if (aom_23.b() && aom_23.e().b() >= n) {
                                aom_22 = aom_23 = new aom_2(list.get(n2), aom_23, null);
                                continue block4;
                            }
                            if (aom_23.b() || aom_23.e().b() < n) continue;
                            aom_23 = aom_23.h();
                        }
                    }
                    if (list.get(n2).a().equals((Object)aon_1.g) || list.get(n2).a().equals((Object)aon_1.h) || list.get(n2).a().equals((Object)aon_1.i)) {
                        while (true) {
                            if (aom_22.a()) {
                                aom_22 = aom_23 = new aom_2(list.get(n2));
                                continue block4;
                            }
                            if (aom_23.g() == null && !aom_23.c() && !aom_23.d()) {
                                aom_23.a(new aom_2(list.get(n2)));
                                aom_23 = aom_23.g();
                                continue block4;
                            }
                            if (aom_23.f() == null && !aom_23.c()) {
                                aom_23.b(new aom_2(list.get(n2)));
                                aom_23 = aom_23.f();
                                continue block4;
                            }
                            if (aom_23.b()) continue block4;
                            aom_23 = aom_23.h();
                        }
                    }
                    if (!list.get(n2).a().equals((Object)aon_1.c)) continue block4;
                    bl = true;
                    while (true) {
                        if (aom_22.a()) {
                            aom_22 = aom_23 = new aom_2(list.get(n2));
                            break;
                        }
                        if (aom_23.g() == null && !aom_23.c() && !aom_23.d()) {
                            aom_23.a(new aom_2(list.get(n2)));
                            aom_23 = aom_23.g();
                            break;
                        }
                        if (aom_23.f() == null && !aom_23.c()) {
                            aom_23.b(new aom_2(list.get(n2)));
                            aom_23 = aom_23.f();
                            break;
                        }
                        if (aom_23.b()) break;
                        aom_23 = aom_23.h();
                    }
                    stack3.push(new Object[]{-1, list.get(n2), aom_22, aom_23});
                    aom_22 = new aom_2();
                    aom_23 = new aom_2();
                    continue block4;
                }
            }
        }
        if (!stack.isEmpty()) {
            throw new aoh_1("[Analyse syntaxique des crit\u00e8es] Erreur de syntaxe");
        }
        return aom_22;
    }

    private static List<apy_1> a(List<apy_1> list, int n) {
        if (n > 0) {
            aoj_2.a(list, n - 1);
            for (int k = 0; k < n; ++k) {
                if (list.get(k).b() < list.get(n).b() || list.get(k).b() <= list.get(n).b()) continue;
                apy_1 apy_12 = list.remove(n);
                list.add(k, apy_12);
            }
        }
        return list;
    }

    static {
        h = false;
        c = new aoj_2();
        d = new ArrayList();
        f = new HashMap();
        g = new HashMap();
        try {
            c.b();
        }
        catch (aoh_1 aoh_12) {
            a.error((Object)"CriteriaException during CriterionSyntaxeAnalyser", (Throwable)aoh_12);
        }
        f = null;
        g = null;
    }
}

