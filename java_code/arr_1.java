/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/*
 * Renamed from arR
 */
public class arr_1
extends arm_1 {
    private static final ars_1[] f = new ars_1[0];
    private String g = null;
    private final TIntObjectHashMap<HashMap<String, ArrayList<asf_1>>> h = new TIntObjectHashMap();
    private final Object i = new Object();
    private final String j;
    private final String k;
    private boolean l;

    public arr_1(String string, String string2, boolean bl) {
        this.j = string;
        this.k = string2;
        this.start();
    }

    public arr_1(String string, String string2) {
        this(string, string2, false);
    }

    @Override
    public ars_1 a(int n, ars_1 ars_12) {
        if (!this.h()) {
            a.error("Tentative d'acces au (Simple)BinaryStorage alors qu'il n'est pas initialis\u00e9");
            return null;
        }
        ars_1[] ars_1Array = this.a("id", n, ars_12);
        if (ars_1Array != null && ars_1Array.length > 0) {
            return ars_1Array[0];
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public ars_1[] a(String string, Object object, ars_1 ars_12) {
        if (!this.h()) {
            a.error("Tentative d'acces au (Simple)BinaryStorage alors qu'il n'est pas initialis\u00e9");
            return f;
        }
        LinkedList<ars_1> linkedList = new LinkedList<ars_1>();
        Object object2 = this.i;
        synchronized (object2) {
            HashMap hashMap = (HashMap)this.h.get(ars_12.f());
            if (hashMap == null) {
                return f;
            }
            if (hashMap.get(string) == null) {
                return f;
            }
            try {
                File file = new File(this.g + this.j);
                if (!file.exists()) {
                    return f;
                }
                String string2 = object.toString();
                for (asf_1 asf_12 : (ArrayList)hashMap.get(string)) {
                    if (!asf_12.c().equals(string2)) continue;
                    try (FileInputStream fileInputStream = new FileInputStream(file);
                         DataInputStream dataInputStream = new DataInputStream(fileInputStream);){
                        FileChannel fileChannel = fileInputStream.getChannel();
                        fileChannel.position(asf_12.d());
                        asb_1 asb_12 = new asb_1();
                        asb_12.a(dataInputStream);
                        ars_1 ars_13 = ars_12.a();
                        ByteBuffer byteBuffer = ByteBuffer.wrap(asb_12.c());
                        ars_13.a(byteBuffer, asb_12.a(), asb_12.b());
                        if (byteBuffer.remaining() != 0) {
                            a.warn("Objet restaur\u00e9 du simple binary storage : " + byteBuffer.remaining() + " bytes restants non lus [type:" + ars_12.f() + " | id:" + asb_12.a() + "]");
                        }
                        linkedList.add(ars_13);
                        for (asg_1 asg_12 : this.b) {
                            asg_12.c(this, ars_13);
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
        if (!linkedList.isEmpty()) {
            return linkedList.toArray(new ars_1[linkedList.size()]);
        }
        return f;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public ars_1[] a(ars_1 ars_12) {
        if (!this.h()) {
            a.error("Tentative d'acces au (Simple)BinaryStorage alors qu'il n'est pas initialis\u00e9");
            return f;
        }
        LinkedList<Object> linkedList = new LinkedList<Object>();
        Object object = this.i;
        synchronized (object) {
            HashMap hashMap = (HashMap)this.h.get(ars_12.f());
            if (hashMap == null) {
                return f;
            }
            try {
                File file = new File(this.g + this.j);
                if (!file.exists()) {
                    return f;
                }
                for (asf_1 asf_12 : (ArrayList)hashMap.get("id")) {
                    asb_1 asb_12;
                    Object object2;
                    try (Object object3 = new FileInputStream(file);){
                        object2 = new DataInputStream((InputStream)object3);
                        try {
                            FileChannel fileChannel = ((FileInputStream)object3).getChannel();
                            fileChannel.position(asf_12.d());
                            asb_12 = new asb_1();
                            asb_12.a((DataInputStream)object2);
                        }
                        finally {
                            ((FilterInputStream)object2).close();
                        }
                    }
                    object3 = ars_12.a();
                    object2 = ByteBuffer.wrap(asb_12.c());
                    ((ars_1)object3).a((ByteBuffer)object2, asb_12.a(), asb_12.b());
                    if (((Buffer)object2).remaining() != 0) {
                        a.warn("Objet restaur\u00e9 du simple binary storage : " + ((Buffer)object2).remaining() + " bytes restants non lus [type:" + ars_12.f() + " | id:" + asb_12.a() + "]");
                    }
                    linkedList.add(object3);
                    for (asg_1 asg_12 : this.b) {
                        asg_12.c(this, (ars_1)object3);
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
        if (!linkedList.isEmpty()) {
            return linkedList.toArray(new ars_1[linkedList.size()]);
        }
        return f;
    }

    public void a(String string) {
        if (string != null) {
            Object object = string;
            if (((String)object).charAt(((String)object).length() - 1) != '/') {
                object = (String)object + "/";
            }
            this.l = false;
            this.g = object;
        }
    }

    public boolean h() {
        return this.l;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean e() {
        assert (this.g != null) : "Il faut initialiser m_baseWorkspace";
        Object object = this.i;
        synchronized (object) {
            try {
                File file = new File(this.g);
                if (file.exists() && !file.isDirectory()) {
                    throw new RuntimeException("Tentative de changement de workspace [" + this.g + "] vers un fichier [not directory] existant [Aborted & Shutdown]");
                }
                if (!file.exists() && !file.mkdirs()) {
                    throw new RuntimeException("Impossible de creer l'arborescence de repertoire [" + this.g + "] lors d'un changement de workspace inexistant [Aborted & Shutdown]");
                }
                this.h.clear();
                File file2 = new File(this.g + this.k);
                if (!file2.exists()) {
                    file2.createNewFile();
                    a.info("Fichier d'index non trouv\u00e9 pour le chargement de la source binaire : Creation d'une nouvelle source");
                    this.i();
                    return true;
                }
                try {
                    FileInputStream fileInputStream = new FileInputStream(file2);
                    try {
                        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                        try {
                            while (true) {
                                asf_1 asf_12 = new asf_1();
                                asf_12.a(dataInputStream);
                                this.a(asf_12);
                            }
                        }
                        catch (Throwable throwable) {
                            try {
                                dataInputStream.close();
                            }
                            catch (Throwable throwable2) {
                                throwable.addSuppressed(throwable2);
                            }
                            throw throwable;
                        }
                    }
                    catch (Throwable throwable) {
                        try {
                            fileInputStream.close();
                        }
                        catch (Throwable throwable3) {
                            throwable.addSuppressed(throwable3);
                        }
                        throw throwable;
                    }
                }
                catch (EOFException eOFException) {
                }
            }
            catch (IOException iOException) {
                a.error(iOException.getMessage(), (Throwable)iOException);
            }
            this.i();
            return true;
        }
    }

    private void i() {
        this.l = true;
        for (asg_1 asg_12 : this.b) {
            asg_12.a((arm_1)this, this.f());
        }
    }

    private void a(asf_1 asf_12) {
        ArrayList<asf_1> arrayList;
        HashMap<String, ArrayList<asf_1>> hashMap = (HashMap<String, ArrayList<asf_1>>)this.h.get(asf_12.a());
        if (hashMap == null) {
            hashMap = new HashMap<String, ArrayList<asf_1>>(5);
            this.h.put(asf_12.a(), hashMap);
        }
        if ((arrayList = (ArrayList<asf_1>)hashMap.get(asf_12.b())) == null) {
            arrayList = new ArrayList<asf_1>(300);
            hashMap.put(asf_12.b(), arrayList);
        }
        arrayList.add(asf_12);
    }

    @Override
    protected void b(ars_1 ars_12) {
        a.error("Remove call on a ReadOnlyBinaryStorage");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void c(ars_1 ars_12) {
        Object object = this.i;
        synchronized (object) {
            byte[] byArray = ars_12.e();
            if (byArray == null) {
                a.error("Tentative de sauvegarde d'un binary storable qui n'a aucun bloc de donn\u00e9es " + ars_12);
                return;
            }
            try {
                long l;
                File file = new File(this.g + this.j);
                if (!file.exists()) {
                    file.createNewFile();
                }
                try (Field[] fieldArray = new FileOutputStream(this.g + this.j, true);
                     Field[] fieldArray2 = new DataOutputStream((OutputStream)fieldArray);){
                    FileChannel fileChannel = fieldArray.getChannel();
                    l = fileChannel.size();
                    asb_1 asb_12 = new asb_1(ars_12.G(), ars_12.H(), byArray);
                    asb_12.a((DataOutputStream)fieldArray2);
                }
                this.a("id", ars_12.G(), ars_12.f(), l);
                for (Field field : fieldArray = ars_12.getClass().getDeclaredFields()) {
                    Object object2;
                    if (!field.isAnnotationPresent(ary_1.class)) continue;
                    ary_1 ary_12 = field.getAnnotation(ary_1.class);
                    if (field.isAccessible()) {
                        object2 = field.get(ars_12);
                    } else {
                        field.setAccessible(true);
                        object2 = field.get(ars_12);
                        field.setAccessible(false);
                    }
                    this.a(ary_12.a(), object2, ars_12.f(), l);
                }
            }
            catch (IOException | IllegalAccessException exception) {
                a.error(exception.getMessage(), (Throwable)exception);
            }
        }
    }

    private void a(String string, Object object, int n, long l) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(this.g + this.k, true);
             DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);){
            asf_1 asf_12 = new asf_1(n, string, object.toString(), l);
            asf_12.a(dataOutputStream);
            this.a(asf_12);
        }
        catch (IOException iOException) {
            a.error(iOException.getMessage());
        }
    }

    @Override
    protected String f() {
        return this.g;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void g() {
        Object object = this.i;
        synchronized (object) {
            System.out.println("cleanUpFiles m_baseWorkspace " + this.g);
            File file = new File(this.g + this.k);
            File file2 = new File(this.g + this.j);
            file.delete();
            file2.delete();
            this.h.clear();
        }
    }
}

