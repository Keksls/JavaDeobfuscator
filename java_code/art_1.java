/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Renamed from arT
 */
public final class art_1
extends arm_1 {
    private final TIntObjectHashMap<ArrayList<arx_1>> e = new TIntObjectHashMap();
    private final TIntObjectHashMap<TIntObjectHashMap<ArrayList<asd_1>>> f = new TIntObjectHashMap();
    private static final boolean g = false;
    final String h;
    private final int i = 20000000;
    private final int j = 500;
    private arx_1 k;
    private final Object l = new Object();
    final StringBuilder m = new StringBuilder(20);
    private static final Pattern n = Pattern.compile("[^a-zA-Z0-9-_/\\.]");
    private boolean o;
    private final File p;
    private final File q;
    private final File r;
    private final File s;
    private final TLongObjectHashMap<File> t = new TLongObjectHashMap();
    final TIntObjectHashMap<File> u = new TIntObjectHashMap();
    private static final String v = "data.";
    private static final String w = ".bdat";
    private static final String x = "index.";
    private static final String y = ".bdat";
    private static final String z = "metadata.bdat";
    private final aso_2 A;
    private final aso_2 B = aso_2.a(aso_2.b);
    private final aso_2 C = aso_2.a(aso_2.b);

    protected art_1(String string) {
        this(string, false);
    }

    private art_1(String string, boolean bl) {
        this.h = art_1.b(string);
        this.s = new File(this.h);
        this.p = new File(this.h + "~building_index.tmp");
        this.q = new File(this.h + "~building_data.tmp");
        this.r = new File(this.h + z);
        this.setName("BinaryStorage (" + this.h + ")");
        aso_2 aso_22 = this.A = bl ? aso_2.a(aso_2.c) : aso_2.a(aso_2.b);
        if (this.e()) {
            this.start();
        } else {
            a.error("Echec de l'initialisation du binary storage " + this);
        }
    }

    public static boolean a(String string) {
        File file = new File(art_1.b(string) + z);
        return file.exists();
    }

    private static String b(String string) {
        Object object = string;
        if (((String)(object = n.matcher((CharSequence)object).replaceAll("_"))).charAt(0) == '/') {
            object = ((String)object).substring(1, ((String)object).length());
        }
        if (((String)object).charAt(((String)object).length() - 1) != '/') {
            object = (String)object + "/";
        }
        return object;
    }

    public boolean h() {
        return this.o;
    }

    @Override
    protected String f() {
        return this.h;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected boolean e() {
        Object object = this.l;
        synchronized (object) {
            block29: {
                if (this.o) {
                    a.error("Binary storage already initialize : " + this.h);
                    return false;
                }
                try {
                    if (this.s.exists() && !this.s.isDirectory()) {
                        a.error("Tentative de changement de workspace [" + this.h + "] vers un fichier [not directory] existant [Aborted & Shutdown]");
                        return false;
                    }
                    if (!this.s.exists() && !this.s.mkdirs()) {
                        a.error("Impossible de creer l'arborescence de repertoire [" + this.h + "] lors d'un changement de workspace inexistant [Aborted & Shutdown]");
                        return false;
                    }
                    this.e.clear();
                    if (!this.r.exists()) {
                        this.r.createNewFile();
                        a.info("Fichier de meta donn\u00e9es non trouv\u00e9 pour le chargement de la source binaire : Creation d'une nouvelle source");
                        break block29;
                    }
                    Object object2 = null;
                    Object object3 = null;
                    try {
                        object2 = new FileInputStream(this.r);
                        object3 = this.C.a((FileInputStream)object2);
                        try {
                            while (true) {
                                int n = ((DataInputStream)object3).readInt();
                                int n2 = ((DataInputStream)object3).readInt();
                                int n3 = ((DataInputStream)object3).readInt();
                                int n4 = ((DataInputStream)object3).readInt();
                                int n5 = n;
                                ArrayList<arx_1> arrayList = (ArrayList<arx_1>)this.e.get(n5);
                                if (arrayList == null) {
                                    arrayList = new ArrayList<arx_1>();
                                    this.e.put(n5, arrayList);
                                }
                                arrayList.add(new arx_1(this, n5, n2, n3, n4));
                            }
                        }
                        catch (EOFException eOFException) {
                            if (object3 != null) {
                                try {
                                    ((FilterInputStream)object3).close();
                                }
                                catch (IOException iOException) {
                                    a.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                                }
                            }
                            if (object2 != null) {
                                try {
                                    ((FileInputStream)object2).close();
                                }
                                catch (IOException iOException) {
                                    a.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                                }
                            }
                        }
                    }
                    catch (Throwable throwable) {
                        if (object3 != null) {
                            try {
                                ((FilterInputStream)object3).close();
                            }
                            catch (IOException iOException) {
                                a.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                            }
                        }
                        if (object2 != null) {
                            try {
                                ((FileInputStream)object2).close();
                            }
                            catch (IOException iOException) {
                                a.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                            }
                        }
                        throw throwable;
                    }
                }
                catch (FileNotFoundException fileNotFoundException) {
                    a.error(fileNotFoundException.getMessage(), (Throwable)fileNotFoundException);
                    return false;
                }
                catch (IOException iOException) {
                    a.error(iOException.getMessage(), (Throwable)iOException);
                    return false;
                }
            }
            this.o = true;
            for (Object object3 : this.b) {
                object3.a((arm_1)this, this.f());
            }
            return true;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void i() {
        try {
            FileOutputStream fileOutputStream = null;
            FilterOutputStream filterOutputStream = null;
            try {
                fileOutputStream = new FileOutputStream(this.r, false);
                FilterOutputStream filterOutputStream2 = filterOutputStream = this.C.a(fileOutputStream);
                if (!this.e.isEmpty()) {
                    this.e.forEachEntry((TIntObjectProcedure)new aru_1(this, (DataOutputStream)filterOutputStream2));
                }
            }
            finally {
                if (filterOutputStream != null) {
                    try {
                        filterOutputStream.close();
                    }
                    catch (IOException iOException) {
                        a.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    }
                    catch (IOException iOException) {
                        a.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                    }
                }
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            a.error(fileNotFoundException.getMessage(), (Throwable)fileNotFoundException);
        }
        catch (IOException iOException) {
            a.error(iOException.getMessage(), (Throwable)iOException);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void c(ars_1 ars_12) {
        Object object = this.l;
        synchronized (object) {
            ArrayList<asd_1> arrayList = this.a(d, ars_12.f(), (Object)ars_12.G(), 1);
            if (arrayList.size() <= 0) {
                this.d(ars_12);
            } else {
                this.a(ars_12, arrayList.get(0));
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void d(ars_1 ars_12) {
        byte[] byArray = ars_12.e();
        if (byArray == null) {
            a.error("Tentative de sauvegarde d'un binary storable qui n'a aucun bloc de donn\u00e9es " + ars_12);
            return;
        }
        long l = ars_12.a(byArray);
        int n = byArray.length + 4 + 2 + 4;
        this.a(ars_12.f(), n);
        try {
            Field[] fieldArray;
            long l2;
            File file = this.k.d;
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = null;
            FilterOutputStream filterOutputStream = null;
            try {
                fileOutputStream = new FileOutputStream(this.k.d, true);
                filterOutputStream = this.A.a(fileOutputStream);
                l2 = fileOutputStream.getChannel().size();
                fieldArray = new asb_1(ars_12.G(), ars_12.H(), byArray);
                fieldArray.a((DataOutputStream)filterOutputStream);
            }
            finally {
                if (filterOutputStream != null) {
                    try {
                        filterOutputStream.close();
                    }
                    catch (IOException iOException) {
                        a.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    }
                    catch (IOException iOException) {
                        a.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                    }
                }
            }
            ++this.k.c;
            this.k.b += n;
            this.a(d, ars_12.G(), ars_12.f(), this.k.a, l2, l);
            for (Field field : fieldArray = ars_12.getClass().getDeclaredFields()) {
                Object object;
                if (!field.isAnnotationPresent(ary_1.class)) continue;
                ary_1 ary_12 = field.getAnnotation(ary_1.class);
                if (field.isAccessible()) {
                    object = field.get(ars_12);
                } else {
                    field.setAccessible(true);
                    object = field.get(ars_12);
                    field.setAccessible(false);
                }
                this.a(ary_12.a().hashCode(), object, ars_12.f(), this.k.a, l2, l);
            }
            this.i();
        }
        catch (IOException iOException) {
            a.error(iOException.getMessage(), (Throwable)iOException);
        }
        catch (IllegalAccessException illegalAccessException) {
            a.error(illegalAccessException.getMessage(), (Throwable)illegalAccessException);
        }
    }

    private void a(ars_1 ars_12, asd_1 asd_12) {
        asd_1 asd_13 = asd_12;
        byte[] byArray = ars_12.e();
        if (byArray == null) {
            a.error("Tentative de sauvegarde d'un binary storable qui n'a aucun bloc de donn\u00e9es " + ars_12);
            return;
        }
        if (asd_13.c != ars_12.a(byArray)) {
            this.b(ars_12, asd_12);
            this.d(ars_12);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void b(ars_1 ars_12) {
        Object object = this.l;
        synchronized (object) {
            ArrayList<asd_1> arrayList = this.a(d, ars_12.f(), (Object)ars_12.G(), 1);
            if (!arrayList.isEmpty()) {
                this.b(ars_12, arrayList.get(0));
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void b(ars_1 ars_12, asd_1 asd_12) {
        this.b(ars_12.f(), asd_12.a);
        try {
            int n;
            FileInputStream fileInputStream = null;
            FilterInputStream filterInputStream = null;
            FileOutputStream fileOutputStream = null;
            try {
                this.m.setLength(0);
                fileInputStream = new FileInputStream(this.k.d);
                filterInputStream = this.A.a(fileInputStream);
                int n2 = (int)fileInputStream.getChannel().size();
                fileOutputStream = new FileOutputStream(this.q, false);
                fileInputStream.getChannel().position(asd_12.b);
                n = asb_1.b((DataInputStream)filterInputStream);
                long l = asd_12.b + (long)n;
                fileInputStream.getChannel().transferTo(0L, asd_12.b, fileOutputStream.getChannel());
                fileInputStream.getChannel().transferTo(l, (long)n2 - l, fileOutputStream.getChannel());
            }
            finally {
                if (filterInputStream != null) {
                    try {
                        filterInputStream.close();
                    }
                    catch (IOException iOException) {
                        a.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                    }
                }
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    }
                    catch (IOException iOException) {
                        a.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    }
                    catch (IOException iOException) {
                        a.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                    }
                }
            }
            this.m.setLength(0);
            File file = this.k.d;
            if (file.exists()) {
                file.delete();
            }
            this.q.renameTo(file);
            --this.k.c;
            this.k.b -= n;
            this.a(asd_12.a, asd_12.b, n, ars_12);
            this.i();
        }
        catch (FileNotFoundException fileNotFoundException) {
            a.error(fileNotFoundException.getMessage(), (Throwable)fileNotFoundException);
        }
        catch (IOException iOException) {
            a.error(iOException.getMessage(), (Throwable)iOException);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(int n, long l, long l2, ars_1 ars_12) {
        block17: {
            try {
                int n2 = ars_12.f();
                TIntObjectHashMap tIntObjectHashMap = (TIntObjectHashMap)this.f.get(n2);
                if (tIntObjectHashMap != null) {
                    TIntObjectIterator tIntObjectIterator = tIntObjectHashMap.iterator();
                    while (tIntObjectIterator.hasNext()) {
                        Object object;
                        tIntObjectIterator.advance();
                        FileOutputStream fileOutputStream = null;
                        FilterOutputStream filterOutputStream = null;
                        try {
                            fileOutputStream = new FileOutputStream(this.p, false);
                            filterOutputStream = this.B.a(fileOutputStream);
                            object = ((ArrayList)tIntObjectIterator.value()).iterator();
                            while (object.hasNext()) {
                                asd_1 asd_12 = (asd_1)object.next();
                                if (asd_12.a == n && asd_12.b > l) {
                                    asd_12.b -= l2;
                                    asd_12.a((DataOutputStream)filterOutputStream);
                                    continue;
                                }
                                if (asd_12.a == n && asd_12.b == l) {
                                    object.remove();
                                    asd_12.b();
                                    continue;
                                }
                                if (n == asd_12.a && (n != asd_12.a || asd_12.b >= l)) continue;
                                asd_12.a((DataOutputStream)filterOutputStream);
                            }
                        }
                        finally {
                            if (filterOutputStream != null) {
                                try {
                                    filterOutputStream.close();
                                }
                                catch (IOException iOException) {
                                    a.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                                }
                            }
                        }
                        object = this.c(tIntObjectIterator.key(), n2);
                        if (((File)object).exists()) {
                            ((File)object).delete();
                        }
                        this.p.renameTo((File)object);
                    }
                    break block17;
                }
                a.error("Situation anormale : on met a jour des indexes qu'on a pas encore mont\u00e9 en memoire");
            }
            catch (IOException iOException) {
                a.error(iOException.getMessage(), (Throwable)iOException);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private ars_1[] a(ArrayList<asd_1> arrayList, ars_1 ars_12) {
        if (arrayList.size() == 0) {
            return null;
        }
        ArrayList<ars_1> arrayList2 = new ArrayList<ars_1>();
        int n = ars_12.f();
        Iterator<asd_1> iterator = arrayList.iterator();
        block18: while (true) {
            if (!iterator.hasNext()) {
                if (arrayList2.size() <= 0) return null;
                return arrayList2.toArray(new ars_1[arrayList2.size()]);
            }
            asd_1 asd_12 = iterator.next();
            int n2 = asd_12.a;
            long l = asd_12.b;
            this.b(n, n2);
            try {
                ars_1 ars_13;
                this.m.setLength(0);
                File file = this.k.d;
                if (!file.exists()) {
                    return null;
                }
                FileInputStream fileInputStream = null;
                FilterInputStream filterInputStream = null;
                asb_1 asb_12 = null;
                try {
                    fileInputStream = new FileInputStream(file);
                    filterInputStream = this.A.a(fileInputStream);
                    if (l < 0L) {
                        a.error("position n\u00e9gative");
                        ars_13 = null;
                        return ars_13;
                    }
                    fileInputStream.getChannel().position(l);
                    asb_12 = new asb_1();
                    asb_12.a((DataInputStream)filterInputStream);
                }
                finally {
                    if (filterInputStream != null) {
                        try {
                            filterInputStream.close();
                        }
                        catch (IOException iOException) {
                            a.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                        }
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        }
                        catch (IOException iOException) {
                            a.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                        }
                    }
                }
                ars_13 = ars_12.a();
                ByteBuffer byteBuffer = ByteBuffer.wrap(asb_12.c());
                ars_13.a(byteBuffer, asb_12.a(), asb_12.b());
                if (byteBuffer.remaining() != 0) {
                    a.warn("Objet restaur\u00e9 du binary storage : " + byteBuffer.remaining() + " bytes restants non lus [type:" + ars_12.f() + " | id:" + asb_12.a() + "]");
                }
                arrayList2.add(ars_13);
                Iterator iterator2 = this.b.iterator();
                while (true) {
                    if (!iterator2.hasNext()) continue block18;
                    asg_1 asg_12 = (asg_1)iterator2.next();
                    asg_12.c(this, ars_13);
                }
            }
            catch (IOException iOException) {
                a.error(iOException.getMessage(), (Throwable)iOException);
                continue;
            }
            break;
        }
    }

    @Override
    public ars_1[] a(String string, Object object, ars_1 ars_12) {
        return this.a(string.hashCode(), object, ars_12);
    }

    public ars_1[] a(int n, Object object, ars_1 ars_12) {
        return this.a(n, object, ars_12, Integer.MAX_VALUE);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ars_1[] a(int n, Object object, ars_1 ars_12, int n2) {
        Object object2 = this.l;
        synchronized (object2) {
            return this.a(this.a(n, ars_12.f(), object, n2), ars_12);
        }
    }

    @Override
    public ars_1 a(int n, ars_1 ars_12) {
        ars_1[] ars_1Array = this.a(d, (Object)n, ars_12, 1);
        if (ars_1Array != null && ars_1Array.length > 0) {
            return ars_1Array[0];
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public ars_1[] a(ars_1 ars_12) {
        Object object = this.l;
        synchronized (object) {
            ArrayList arrayList;
            TIntObjectHashMap tIntObjectHashMap = (TIntObjectHashMap)this.f.get(ars_12.f());
            if (tIntObjectHashMap == null) {
                this.b(ars_12.f());
                tIntObjectHashMap = (TIntObjectHashMap)this.f.get(ars_12.f());
            }
            if ((arrayList = (ArrayList)tIntObjectHashMap.get(d)) == null || arrayList.isEmpty()) {
                return null;
            }
            return this.a(arrayList, ars_12);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void g() {
        Object object = this.l;
        synchronized (object) {
            File[] fileArray;
            for (File file : fileArray = this.s.listFiles(new arv_1(this))) {
                file.delete();
            }
        }
    }

    private void a(int n, int n2) {
        ArrayList<arx_1> arrayList = (ArrayList<arx_1>)this.e.get(n);
        arx_1 arx_12 = null;
        if (arrayList == null) {
            arx_12 = new arx_1(this, n, 1, 0, 0);
            arrayList = new ArrayList<arx_1>();
            arrayList.add(arx_12);
            this.e.put(n, arrayList);
        }
        int n3 = 0;
        for (arx_1 arx_13 : arrayList) {
            if (arx_13.a > n3) {
                n3 = arx_13.a;
            }
            if (arx_13.c + 1 > 500 || n2 + arx_13.b > 20000000) continue;
            arx_12 = arx_13;
            break;
        }
        if (arx_12 == null) {
            arx_12 = new arx_1(this, n, n3 + 1, 0, 0);
            arrayList.add(arx_12);
        }
        this.a(arx_12);
    }

    private boolean b(int n, int n2) {
        ArrayList<arx_1> arrayList = (ArrayList<arx_1>)this.e.get(n);
        arx_1 arx_12 = null;
        if (arrayList == null) {
            arx_12 = new arx_1(this, n, 1, 0, 0);
            arrayList = new ArrayList<arx_1>();
            arrayList.add(arx_12);
            this.e.put(n, arrayList);
        }
        for (arx_1 arx_13 : arrayList) {
            if (arx_13.a != n2) continue;
            this.a(arx_13);
            return true;
        }
        return false;
    }

    private void a(arx_1 arx_12) {
        this.k = arx_12;
    }

    private File c(int n, int n2) {
        long l = Hw.c(n2, n);
        File file = (File)this.t.get(l);
        if (file != null) {
            return file;
        }
        this.m.setLength(0);
        String string = this.m.append(this.h).append(x).append(n2).append("_").append(n).append(".bdat").toString();
        file = new File(string);
        this.t.put(l, (Object)file);
        return file;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(int n, Object object, int n2, int n3, long l, long l2) {
        try {
            ArrayList<asd_1> arrayList;
            File file = this.c(n, n2);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = null;
            FilterOutputStream filterOutputStream = null;
            asd_1 asd_12 = null;
            try {
                fileOutputStream = new FileOutputStream(file, true);
                filterOutputStream = this.B.a(fileOutputStream);
                asd_12 = asd_1.a(object.toString(), n3, l, l2);
                asd_12.a((DataOutputStream)filterOutputStream);
            }
            finally {
                if (filterOutputStream != null) {
                    try {
                        filterOutputStream.close();
                    }
                    catch (IOException iOException) {
                        a.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    }
                    catch (IOException iOException) {
                        a.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                    }
                }
            }
            TIntObjectHashMap tIntObjectHashMap = (TIntObjectHashMap)this.f.get(n2);
            if (tIntObjectHashMap == null) {
                this.b(n2);
                tIntObjectHashMap = (TIntObjectHashMap)this.f.get(n2);
            }
            if ((arrayList = (ArrayList<asd_1>)tIntObjectHashMap.get(n)) == null) {
                arrayList = new ArrayList<asd_1>(50);
                tIntObjectHashMap.put(n, arrayList);
            }
            arrayList.add(asd_12);
        }
        catch (IOException iOException) {
            a.error(iOException.getMessage(), (Throwable)iOException);
        }
    }

    private ArrayList<asd_1> a(int n, int n2, Object object, int n3) {
        ArrayList arrayList;
        TIntObjectHashMap tIntObjectHashMap = (TIntObjectHashMap)this.f.get(n2);
        if (tIntObjectHashMap == null) {
            this.b(n2);
            tIntObjectHashMap = (TIntObjectHashMap)this.f.get(n2);
        }
        ArrayList<asd_1> arrayList2 = new ArrayList<asd_1>();
        if (tIntObjectHashMap != null && (arrayList = (ArrayList)tIntObjectHashMap.get(n)) != null) {
            int n4 = arrayList.size();
            String string = object.toString();
            for (int k = 0; k < n4; ++k) {
                asd_1 asd_12 = (asd_1)arrayList.get(k);
                if (!asd_12.d.equals(string)) continue;
                arrayList2.add(asd_12);
                if (arrayList2.size() >= n3) break;
            }
        }
        return arrayList2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void b(int n) {
        Pattern pattern = Pattern.compile(x.replaceAll("\\.", "\\\\\\.") + n + "_([a-zA-Z0-9_.-]+)" + ".bdat".replaceAll("\\.", "\\\\\\."));
        File[] fileArray = this.s.listFiles(new arw_1(this, pattern));
        TIntObjectHashMap tIntObjectHashMap = (TIntObjectHashMap)this.f.get(n);
        if (tIntObjectHashMap == null) {
            tIntObjectHashMap = new TIntObjectHashMap();
            this.f.put(n, (Object)tIntObjectHashMap);
        }
        for (File file : fileArray) {
            int n2;
            Matcher matcher = pattern.matcher(file.getName());
            if (!matcher.matches()) continue;
            try {
                n2 = Integer.parseInt(matcher.group(1));
            }
            catch (NumberFormatException numberFormatException) {
                a.error("Nom de fichier d'index mal form\u00e9 : " + file.getName());
                continue;
            }
            try {
                FileInputStream fileInputStream = null;
                FilterInputStream filterInputStream = null;
                try {
                    fileInputStream = new FileInputStream(file);
                    filterInputStream = this.B.a(fileInputStream);
                    try {
                        while (true) {
                            asd_1 asd_12 = asd_1.a();
                            asd_12.a((DataInputStream)filterInputStream);
                            ArrayList<asd_1> arrayList = (ArrayList<asd_1>)tIntObjectHashMap.get(n2);
                            if (arrayList == null) {
                                arrayList = new ArrayList<asd_1>();
                                tIntObjectHashMap.put(n2, arrayList);
                            }
                            arrayList.add(asd_12);
                        }
                    }
                    catch (EOFException eOFException) {
                        if (filterInputStream != null) {
                            try {
                                filterInputStream.close();
                            }
                            catch (IOException iOException) {
                                a.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                            }
                        }
                        if (fileInputStream == null) continue;
                        try {
                            fileInputStream.close();
                        }
                        catch (IOException iOException) {
                            a.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                        }
                    }
                }
                catch (Throwable throwable) {
                    if (filterInputStream != null) {
                        try {
                            filterInputStream.close();
                        }
                        catch (IOException iOException) {
                            a.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                        }
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        }
                        catch (IOException iOException) {
                            a.error("Impossible de fermer le descripteur ouvert sur un fichier !", (Throwable)iOException);
                        }
                    }
                    throw throwable;
                }
            }
            catch (FileNotFoundException fileNotFoundException) {
                a.error(fileNotFoundException.getMessage());
            }
            catch (IOException iOException) {
                a.error(iOException.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return "BinaryStorage working under " + this.h;
    }
}

