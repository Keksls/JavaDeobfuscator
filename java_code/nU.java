/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.Internal
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MapEntry
 *  com.google.protobuf.MapField
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

public final class nU
extends GeneratedMessageV3
implements nY {
    private static final long E = 0L;
    int F;
    public static final int a = 1;
    volatile Object G;
    public static final int b = 2;
    long H;
    public static final int c = 3;
    long I;
    public static final int d = 4;
    boolean J;
    public static final int e = 5;
    volatile Object K;
    public static final int f = 6;
    volatile Object L;
    public static final int g = 7;
    int M;
    public static final int h = 8;
    int N;
    public static final int i = 9;
    long O;
    public static final int j = 10;
    int P;
    public static final int k = 11;
    int Q;
    public static final int l = 12;
    int R;
    public static final int m = 13;
    long S;
    public static final int n = 14;
    volatile Object T;
    public static final int o = 15;
    int U;
    public static final int p = 16;
    int V;
    public static final int q = 17;
    int W;
    public static final int r = 18;
    long X;
    public static final int s = 19;
    volatile Object Y;
    public static final int t = 20;
    boolean Z;
    public static final int u = 21;
    volatile Object aa;
    public static final int v = 22;
    boolean ab;
    public static final int w = 23;
    volatile Object ac;
    public static final int x = 24;
    boolean ad;
    public static final int y = 25;
    long ae;
    public static final int z = 26;
    long af;
    public static final int A = 27;
    int ag;
    public static final int B = 28;
    long ah;
    public static final int C = 29;
    MapField<Integer, Integer> ai;
    private byte aj = (byte)-1;
    private static final nU ak = new nU();
    @Deprecated
    public static final Parser<nU> D = new nV();

    nU(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private nU() {
        this.G = "";
        this.H = 0L;
        this.I = 0L;
        this.J = false;
        this.K = "null";
        this.L = "";
        this.M = 0;
        this.N = 0;
        this.O = 0L;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0L;
        this.T = "null";
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0L;
        this.Y = "null";
        this.Z = false;
        this.aa = "";
        this.ab = false;
        this.ac = "";
        this.ad = false;
        this.ae = -1L;
        this.af = -1L;
        this.ag = 0;
        this.ah = -1L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    nU(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block38: while (!bl) {
                ByteString byteString;
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block38;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue block38;
                        bl = true;
                        continue block38;
                    }
                    case 10: {
                        byteString = codedInputStream.readBytes();
                        this.F |= 1;
                        this.G = byteString;
                        continue block38;
                    }
                    case 16: {
                        this.F |= 2;
                        this.H = codedInputStream.readInt64();
                        continue block38;
                    }
                    case 24: {
                        this.F |= 4;
                        this.I = codedInputStream.readInt64();
                        continue block38;
                    }
                    case 32: {
                        this.F |= 8;
                        this.J = codedInputStream.readBool();
                        continue block38;
                    }
                    case 42: {
                        byteString = codedInputStream.readBytes();
                        this.F |= 0x10;
                        this.K = byteString;
                        continue block38;
                    }
                    case 50: {
                        byteString = codedInputStream.readBytes();
                        this.F |= 0x20;
                        this.L = byteString;
                        continue block38;
                    }
                    case 56: {
                        this.F |= 0x40;
                        this.M = codedInputStream.readInt32();
                        continue block38;
                    }
                    case 64: {
                        this.F |= 0x80;
                        this.N = codedInputStream.readInt32();
                        continue block38;
                    }
                    case 72: {
                        this.F |= 0x100;
                        this.O = codedInputStream.readInt64();
                        continue block38;
                    }
                    case 80: {
                        this.F |= 0x200;
                        this.P = codedInputStream.readInt32();
                        continue block38;
                    }
                    case 88: {
                        this.F |= 0x400;
                        this.Q = codedInputStream.readInt32();
                        continue block38;
                    }
                    case 96: {
                        this.F |= 0x800;
                        this.R = codedInputStream.readInt32();
                        continue block38;
                    }
                    case 104: {
                        this.F |= 0x1000;
                        this.S = codedInputStream.readInt64();
                        continue block38;
                    }
                    case 114: {
                        byteString = codedInputStream.readBytes();
                        this.F |= 0x2000;
                        this.T = byteString;
                        continue block38;
                    }
                    case 120: {
                        this.F |= 0x4000;
                        this.U = codedInputStream.readInt32();
                        continue block38;
                    }
                    case 128: {
                        this.F |= 0x8000;
                        this.V = codedInputStream.readInt32();
                        continue block38;
                    }
                    case 136: {
                        this.F |= 0x10000;
                        this.W = codedInputStream.readInt32();
                        continue block38;
                    }
                    case 144: {
                        this.F |= 0x20000;
                        this.X = codedInputStream.readInt64();
                        continue block38;
                    }
                    case 154: {
                        byteString = codedInputStream.readBytes();
                        this.F |= 0x40000;
                        this.Y = byteString;
                        continue block38;
                    }
                    case 160: {
                        this.F |= 0x80000;
                        this.Z = codedInputStream.readBool();
                        continue block38;
                    }
                    case 170: {
                        byteString = codedInputStream.readBytes();
                        this.F |= 0x100000;
                        this.aa = byteString;
                        continue block38;
                    }
                    case 176: {
                        this.F |= 0x200000;
                        this.ab = codedInputStream.readBool();
                        continue block38;
                    }
                    case 186: {
                        byteString = codedInputStream.readBytes();
                        this.F |= 0x400000;
                        this.ac = byteString;
                        continue block38;
                    }
                    case 192: {
                        this.F |= 0x800000;
                        this.ad = codedInputStream.readBool();
                        continue block38;
                    }
                    case 200: {
                        this.F |= 0x1000000;
                        this.ae = codedInputStream.readInt64();
                        continue block38;
                    }
                    case 208: {
                        this.F |= 0x2000000;
                        this.af = codedInputStream.readInt64();
                        continue block38;
                    }
                    case 216: {
                        this.F |= 0x4000000;
                        this.ag = codedInputStream.readInt32();
                        continue block38;
                    }
                    case 224: {
                        this.F |= 0x8000000;
                        this.ah = codedInputStream.readInt64();
                        continue block38;
                    }
                    case 234: 
                }
                if ((n & 0x10000000) != 0x10000000) {
                    this.ai = MapField.newMapField(nX.a);
                    n |= 0x10000000;
                }
                byteString = (MapEntry)codedInputStream.readMessage(nX.a.getParserForType(), extensionRegistryLite);
                this.ai.getMutableMap().put((Integer)byteString.getKey(), (Integer)byteString.getValue());
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return nS.a;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 29: {
                return this.aw();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nS.b.ensureFieldAccessorsInitialized(nU.class, nW.class);
    }

    @Override
    public boolean b() {
        return (this.F & 1) == 1;
    }

    @Override
    public String c() {
        Object object = this.G;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.G = string;
        }
        return string;
    }

    @Override
    public ByteString d() {
        Object object = this.G;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.G = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean e() {
        return (this.F & 2) == 2;
    }

    @Override
    public long f() {
        return this.H;
    }

    @Override
    public boolean g() {
        return (this.F & 4) == 4;
    }

    @Override
    public long h() {
        return this.I;
    }

    @Override
    public boolean i() {
        return (this.F & 8) == 8;
    }

    @Override
    public boolean j() {
        return this.J;
    }

    @Override
    public boolean k() {
        return (this.F & 0x10) == 16;
    }

    @Override
    public String l() {
        Object object = this.K;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.K = string;
        }
        return string;
    }

    @Override
    public ByteString m() {
        Object object = this.K;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.K = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean n() {
        return (this.F & 0x20) == 32;
    }

    @Override
    public String o() {
        Object object = this.L;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.L = string;
        }
        return string;
    }

    @Override
    public ByteString p() {
        Object object = this.L;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.L = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean q() {
        return (this.F & 0x40) == 64;
    }

    @Override
    public int r() {
        return this.M;
    }

    @Override
    public boolean s() {
        return (this.F & 0x80) == 128;
    }

    @Override
    public int t() {
        return this.N;
    }

    @Override
    public boolean u() {
        return (this.F & 0x100) == 256;
    }

    @Override
    public long v() {
        return this.O;
    }

    @Override
    public boolean w() {
        return (this.F & 0x200) == 512;
    }

    @Override
    public int x() {
        return this.P;
    }

    @Override
    public boolean y() {
        return (this.F & 0x400) == 1024;
    }

    @Override
    public int z() {
        return this.Q;
    }

    @Override
    public boolean A() {
        return (this.F & 0x800) == 2048;
    }

    @Override
    public int B() {
        return this.R;
    }

    @Override
    public boolean C() {
        return (this.F & 0x1000) == 4096;
    }

    @Override
    public long D() {
        return this.S;
    }

    @Override
    public boolean E() {
        return (this.F & 0x2000) == 8192;
    }

    @Override
    public String F() {
        Object object = this.T;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.T = string;
        }
        return string;
    }

    @Override
    public ByteString G() {
        Object object = this.T;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.T = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean H() {
        return (this.F & 0x4000) == 16384;
    }

    @Override
    public int I() {
        return this.U;
    }

    @Override
    public boolean J() {
        return (this.F & 0x8000) == 32768;
    }

    @Override
    public int K() {
        return this.V;
    }

    @Override
    public boolean L() {
        return (this.F & 0x10000) == 65536;
    }

    @Override
    public int M() {
        return this.W;
    }

    @Override
    public boolean N() {
        return (this.F & 0x20000) == 131072;
    }

    @Override
    public long O() {
        return this.X;
    }

    @Override
    public boolean P() {
        return (this.F & 0x40000) == 262144;
    }

    @Override
    public String Q() {
        Object object = this.Y;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.Y = string;
        }
        return string;
    }

    @Override
    public ByteString R() {
        Object object = this.Y;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.Y = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean S() {
        return (this.F & 0x80000) == 524288;
    }

    @Override
    public boolean T() {
        return this.Z;
    }

    @Override
    public boolean U() {
        return (this.F & 0x100000) == 0x100000;
    }

    @Override
    public String V() {
        Object object = this.aa;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.aa = string;
        }
        return string;
    }

    @Override
    public ByteString W() {
        Object object = this.aa;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.aa = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean X() {
        return (this.F & 0x200000) == 0x200000;
    }

    @Override
    public boolean Y() {
        return this.ab;
    }

    @Override
    public boolean Z() {
        return (this.F & 0x400000) == 0x400000;
    }

    @Override
    public String aa() {
        Object object = this.ac;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.ac = string;
        }
        return string;
    }

    @Override
    public ByteString ab() {
        Object object = this.ac;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.ac = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean ac() {
        return (this.F & 0x800000) == 0x800000;
    }

    @Override
    public boolean ad() {
        return this.ad;
    }

    @Override
    public boolean ae() {
        return (this.F & 0x1000000) == 0x1000000;
    }

    @Override
    public long af() {
        return this.ae;
    }

    @Override
    public boolean ag() {
        return (this.F & 0x2000000) == 0x2000000;
    }

    @Override
    public long ah() {
        return this.af;
    }

    @Override
    public boolean ai() {
        return (this.F & 0x4000000) == 0x4000000;
    }

    @Override
    public int aj() {
        return this.ag;
    }

    @Override
    public boolean ak() {
        return (this.F & 0x8000000) == 0x8000000;
    }

    @Override
    public long al() {
        return this.ah;
    }

    MapField<Integer, Integer> aw() {
        if (this.ai == null) {
            return MapField.emptyMapField(nX.a);
        }
        return this.ai;
    }

    @Override
    public int am() {
        return this.aw().getMap().size();
    }

    @Override
    public boolean a(int n) {
        return this.aw().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, Integer> an() {
        return this.ao();
    }

    @Override
    public Map<Integer, Integer> ao() {
        return this.aw().getMap();
    }

    @Override
    public int a(int n, int n2) {
        Map map = this.aw().getMap();
        return map.containsKey(n) ? (Integer)map.get(n) : n2;
    }

    @Override
    public int b(int n) {
        Map map = this.aw().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (Integer)map.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.aj;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.aj = 0;
            return false;
        }
        if (!this.e()) {
            this.aj = 0;
            return false;
        }
        if (!this.g()) {
            this.aj = 0;
            return false;
        }
        this.aj = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.F & 1) == 1) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)1, (Object)this.G);
        }
        if ((this.F & 2) == 2) {
            codedOutputStream.writeInt64(2, this.H);
        }
        if ((this.F & 4) == 4) {
            codedOutputStream.writeInt64(3, this.I);
        }
        if ((this.F & 8) == 8) {
            codedOutputStream.writeBool(4, this.J);
        }
        if ((this.F & 0x10) == 16) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)5, (Object)this.K);
        }
        if ((this.F & 0x20) == 32) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)6, (Object)this.L);
        }
        if ((this.F & 0x40) == 64) {
            codedOutputStream.writeInt32(7, this.M);
        }
        if ((this.F & 0x80) == 128) {
            codedOutputStream.writeInt32(8, this.N);
        }
        if ((this.F & 0x100) == 256) {
            codedOutputStream.writeInt64(9, this.O);
        }
        if ((this.F & 0x200) == 512) {
            codedOutputStream.writeInt32(10, this.P);
        }
        if ((this.F & 0x400) == 1024) {
            codedOutputStream.writeInt32(11, this.Q);
        }
        if ((this.F & 0x800) == 2048) {
            codedOutputStream.writeInt32(12, this.R);
        }
        if ((this.F & 0x1000) == 4096) {
            codedOutputStream.writeInt64(13, this.S);
        }
        if ((this.F & 0x2000) == 8192) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)14, (Object)this.T);
        }
        if ((this.F & 0x4000) == 16384) {
            codedOutputStream.writeInt32(15, this.U);
        }
        if ((this.F & 0x8000) == 32768) {
            codedOutputStream.writeInt32(16, this.V);
        }
        if ((this.F & 0x10000) == 65536) {
            codedOutputStream.writeInt32(17, this.W);
        }
        if ((this.F & 0x20000) == 131072) {
            codedOutputStream.writeInt64(18, this.X);
        }
        if ((this.F & 0x40000) == 262144) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)19, (Object)this.Y);
        }
        if ((this.F & 0x80000) == 524288) {
            codedOutputStream.writeBool(20, this.Z);
        }
        if ((this.F & 0x100000) == 0x100000) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)21, (Object)this.aa);
        }
        if ((this.F & 0x200000) == 0x200000) {
            codedOutputStream.writeBool(22, this.ab);
        }
        if ((this.F & 0x400000) == 0x400000) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)23, (Object)this.ac);
        }
        if ((this.F & 0x800000) == 0x800000) {
            codedOutputStream.writeBool(24, this.ad);
        }
        if ((this.F & 0x1000000) == 0x1000000) {
            codedOutputStream.writeInt64(25, this.ae);
        }
        if ((this.F & 0x2000000) == 0x2000000) {
            codedOutputStream.writeInt64(26, this.af);
        }
        if ((this.F & 0x4000000) == 0x4000000) {
            codedOutputStream.writeInt32(27, this.ag);
        }
        if ((this.F & 0x8000000) == 0x8000000) {
            codedOutputStream.writeInt64(28, this.ah);
        }
        GeneratedMessageV3.serializeIntegerMapTo((CodedOutputStream)codedOutputStream, this.aw(), nX.a, (int)29);
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.F & 1) == 1) {
            n += GeneratedMessageV3.computeStringSize((int)1, (Object)this.G);
        }
        if ((this.F & 2) == 2) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.H);
        }
        if ((this.F & 4) == 4) {
            n += CodedOutputStream.computeInt64Size((int)3, (long)this.I);
        }
        if ((this.F & 8) == 8) {
            n += CodedOutputStream.computeBoolSize((int)4, (boolean)this.J);
        }
        if ((this.F & 0x10) == 16) {
            n += GeneratedMessageV3.computeStringSize((int)5, (Object)this.K);
        }
        if ((this.F & 0x20) == 32) {
            n += GeneratedMessageV3.computeStringSize((int)6, (Object)this.L);
        }
        if ((this.F & 0x40) == 64) {
            n += CodedOutputStream.computeInt32Size((int)7, (int)this.M);
        }
        if ((this.F & 0x80) == 128) {
            n += CodedOutputStream.computeInt32Size((int)8, (int)this.N);
        }
        if ((this.F & 0x100) == 256) {
            n += CodedOutputStream.computeInt64Size((int)9, (long)this.O);
        }
        if ((this.F & 0x200) == 512) {
            n += CodedOutputStream.computeInt32Size((int)10, (int)this.P);
        }
        if ((this.F & 0x400) == 1024) {
            n += CodedOutputStream.computeInt32Size((int)11, (int)this.Q);
        }
        if ((this.F & 0x800) == 2048) {
            n += CodedOutputStream.computeInt32Size((int)12, (int)this.R);
        }
        if ((this.F & 0x1000) == 4096) {
            n += CodedOutputStream.computeInt64Size((int)13, (long)this.S);
        }
        if ((this.F & 0x2000) == 8192) {
            n += GeneratedMessageV3.computeStringSize((int)14, (Object)this.T);
        }
        if ((this.F & 0x4000) == 16384) {
            n += CodedOutputStream.computeInt32Size((int)15, (int)this.U);
        }
        if ((this.F & 0x8000) == 32768) {
            n += CodedOutputStream.computeInt32Size((int)16, (int)this.V);
        }
        if ((this.F & 0x10000) == 65536) {
            n += CodedOutputStream.computeInt32Size((int)17, (int)this.W);
        }
        if ((this.F & 0x20000) == 131072) {
            n += CodedOutputStream.computeInt64Size((int)18, (long)this.X);
        }
        if ((this.F & 0x40000) == 262144) {
            n += GeneratedMessageV3.computeStringSize((int)19, (Object)this.Y);
        }
        if ((this.F & 0x80000) == 524288) {
            n += CodedOutputStream.computeBoolSize((int)20, (boolean)this.Z);
        }
        if ((this.F & 0x100000) == 0x100000) {
            n += GeneratedMessageV3.computeStringSize((int)21, (Object)this.aa);
        }
        if ((this.F & 0x200000) == 0x200000) {
            n += CodedOutputStream.computeBoolSize((int)22, (boolean)this.ab);
        }
        if ((this.F & 0x400000) == 0x400000) {
            n += GeneratedMessageV3.computeStringSize((int)23, (Object)this.ac);
        }
        if ((this.F & 0x800000) == 0x800000) {
            n += CodedOutputStream.computeBoolSize((int)24, (boolean)this.ad);
        }
        if ((this.F & 0x1000000) == 0x1000000) {
            n += CodedOutputStream.computeInt64Size((int)25, (long)this.ae);
        }
        if ((this.F & 0x2000000) == 0x2000000) {
            n += CodedOutputStream.computeInt64Size((int)26, (long)this.af);
        }
        if ((this.F & 0x4000000) == 0x4000000) {
            n += CodedOutputStream.computeInt32Size((int)27, (int)this.ag);
        }
        if ((this.F & 0x8000000) == 0x8000000) {
            n += CodedOutputStream.computeInt64Size((int)28, (long)this.ah);
        }
        for (Map.Entry entry : this.aw().getMap().entrySet()) {
            MapEntry mapEntry = nX.a.newBuilderForType().setKey((Object)((Integer)entry.getKey())).setValue((Object)((Integer)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)29, (MessageLite)mapEntry);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof nU)) {
            return super.equals(object);
        }
        nU nU2 = (nU)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == nU2.b();
        if (this.b()) {
            bl = bl && this.c().equals(nU2.c());
        }
        boolean bl3 = bl = bl && this.e() == nU2.e();
        if (this.e()) {
            bl = bl && this.f() == nU2.f();
        }
        boolean bl4 = bl = bl && this.g() == nU2.g();
        if (this.g()) {
            bl = bl && this.h() == nU2.h();
        }
        boolean bl5 = bl = bl && this.i() == nU2.i();
        if (this.i()) {
            bl = bl && this.j() == nU2.j();
        }
        boolean bl6 = bl = bl && this.k() == nU2.k();
        if (this.k()) {
            bl = bl && this.l().equals(nU2.l());
        }
        boolean bl7 = bl = bl && this.n() == nU2.n();
        if (this.n()) {
            bl = bl && this.o().equals(nU2.o());
        }
        boolean bl8 = bl = bl && this.q() == nU2.q();
        if (this.q()) {
            bl = bl && this.r() == nU2.r();
        }
        boolean bl9 = bl = bl && this.s() == nU2.s();
        if (this.s()) {
            bl = bl && this.t() == nU2.t();
        }
        boolean bl10 = bl = bl && this.u() == nU2.u();
        if (this.u()) {
            bl = bl && this.v() == nU2.v();
        }
        boolean bl11 = bl = bl && this.w() == nU2.w();
        if (this.w()) {
            bl = bl && this.x() == nU2.x();
        }
        boolean bl12 = bl = bl && this.y() == nU2.y();
        if (this.y()) {
            bl = bl && this.z() == nU2.z();
        }
        boolean bl13 = bl = bl && this.A() == nU2.A();
        if (this.A()) {
            bl = bl && this.B() == nU2.B();
        }
        boolean bl14 = bl = bl && this.C() == nU2.C();
        if (this.C()) {
            bl = bl && this.D() == nU2.D();
        }
        boolean bl15 = bl = bl && this.E() == nU2.E();
        if (this.E()) {
            bl = bl && this.F().equals(nU2.F());
        }
        boolean bl16 = bl = bl && this.H() == nU2.H();
        if (this.H()) {
            bl = bl && this.I() == nU2.I();
        }
        boolean bl17 = bl = bl && this.J() == nU2.J();
        if (this.J()) {
            bl = bl && this.K() == nU2.K();
        }
        boolean bl18 = bl = bl && this.L() == nU2.L();
        if (this.L()) {
            bl = bl && this.M() == nU2.M();
        }
        boolean bl19 = bl = bl && this.N() == nU2.N();
        if (this.N()) {
            bl = bl && this.O() == nU2.O();
        }
        boolean bl20 = bl = bl && this.P() == nU2.P();
        if (this.P()) {
            bl = bl && this.Q().equals(nU2.Q());
        }
        boolean bl21 = bl = bl && this.S() == nU2.S();
        if (this.S()) {
            bl = bl && this.T() == nU2.T();
        }
        boolean bl22 = bl = bl && this.U() == nU2.U();
        if (this.U()) {
            bl = bl && this.V().equals(nU2.V());
        }
        boolean bl23 = bl = bl && this.X() == nU2.X();
        if (this.X()) {
            bl = bl && this.Y() == nU2.Y();
        }
        boolean bl24 = bl = bl && this.Z() == nU2.Z();
        if (this.Z()) {
            bl = bl && this.aa().equals(nU2.aa());
        }
        boolean bl25 = bl = bl && this.ac() == nU2.ac();
        if (this.ac()) {
            bl = bl && this.ad() == nU2.ad();
        }
        boolean bl26 = bl = bl && this.ae() == nU2.ae();
        if (this.ae()) {
            bl = bl && this.af() == nU2.af();
        }
        boolean bl27 = bl = bl && this.ag() == nU2.ag();
        if (this.ag()) {
            bl = bl && this.ah() == nU2.ah();
        }
        boolean bl28 = bl = bl && this.ai() == nU2.ai();
        if (this.ai()) {
            bl = bl && this.aj() == nU2.aj();
        }
        boolean bl29 = bl = bl && this.ak() == nU2.ak();
        if (this.ak()) {
            bl = bl && this.al() == nU2.al();
        }
        bl = bl && this.aw().equals(nU2.aw());
        bl = bl && this.unknownFields.equals((Object)nU2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + nU.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c().hashCode();
        }
        if (this.e()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.f());
        }
        if (this.g()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashLong((long)this.h());
        }
        if (this.i()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashBoolean((boolean)this.j());
        }
        if (this.k()) {
            n = 37 * n + 5;
            n = 53 * n + this.l().hashCode();
        }
        if (this.n()) {
            n = 37 * n + 6;
            n = 53 * n + this.o().hashCode();
        }
        if (this.q()) {
            n = 37 * n + 7;
            n = 53 * n + this.r();
        }
        if (this.s()) {
            n = 37 * n + 8;
            n = 53 * n + this.t();
        }
        if (this.u()) {
            n = 37 * n + 9;
            n = 53 * n + Internal.hashLong((long)this.v());
        }
        if (this.w()) {
            n = 37 * n + 10;
            n = 53 * n + this.x();
        }
        if (this.y()) {
            n = 37 * n + 11;
            n = 53 * n + this.z();
        }
        if (this.A()) {
            n = 37 * n + 12;
            n = 53 * n + this.B();
        }
        if (this.C()) {
            n = 37 * n + 13;
            n = 53 * n + Internal.hashLong((long)this.D());
        }
        if (this.E()) {
            n = 37 * n + 14;
            n = 53 * n + this.F().hashCode();
        }
        if (this.H()) {
            n = 37 * n + 15;
            n = 53 * n + this.I();
        }
        if (this.J()) {
            n = 37 * n + 16;
            n = 53 * n + this.K();
        }
        if (this.L()) {
            n = 37 * n + 17;
            n = 53 * n + this.M();
        }
        if (this.N()) {
            n = 37 * n + 18;
            n = 53 * n + Internal.hashLong((long)this.O());
        }
        if (this.P()) {
            n = 37 * n + 19;
            n = 53 * n + this.Q().hashCode();
        }
        if (this.S()) {
            n = 37 * n + 20;
            n = 53 * n + Internal.hashBoolean((boolean)this.T());
        }
        if (this.U()) {
            n = 37 * n + 21;
            n = 53 * n + this.V().hashCode();
        }
        if (this.X()) {
            n = 37 * n + 22;
            n = 53 * n + Internal.hashBoolean((boolean)this.Y());
        }
        if (this.Z()) {
            n = 37 * n + 23;
            n = 53 * n + this.aa().hashCode();
        }
        if (this.ac()) {
            n = 37 * n + 24;
            n = 53 * n + Internal.hashBoolean((boolean)this.ad());
        }
        if (this.ae()) {
            n = 37 * n + 25;
            n = 53 * n + Internal.hashLong((long)this.af());
        }
        if (this.ag()) {
            n = 37 * n + 26;
            n = 53 * n + Internal.hashLong((long)this.ah());
        }
        if (this.ai()) {
            n = 37 * n + 27;
            n = 53 * n + this.aj();
        }
        if (this.ak()) {
            n = 37 * n + 28;
            n = 53 * n + Internal.hashLong((long)this.al());
        }
        if (!this.aw().getMap().isEmpty()) {
            n = 37 * n + 29;
            n = 53 * n + this.aw().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static nU a(ByteBuffer byteBuffer) {
        return (nU)D.parseFrom(byteBuffer);
    }

    public static nU a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (nU)D.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static nU a(ByteString byteString) {
        return (nU)D.parseFrom(byteString);
    }

    public static nU a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (nU)D.parseFrom(byteString, extensionRegistryLite);
    }

    public static nU a(byte[] byArray) {
        return (nU)D.parseFrom(byArray);
    }

    public static nU a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (nU)D.parseFrom(byArray, extensionRegistryLite);
    }

    public static nU a(InputStream inputStream) {
        return (nU)GeneratedMessageV3.parseWithIOException(D, (InputStream)inputStream);
    }

    public static nU a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nU)GeneratedMessageV3.parseWithIOException(D, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static nU b(InputStream inputStream) {
        return (nU)GeneratedMessageV3.parseDelimitedWithIOException(D, (InputStream)inputStream);
    }

    public static nU b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nU)GeneratedMessageV3.parseDelimitedWithIOException(D, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static nU a(CodedInputStream codedInputStream) {
        return (nU)GeneratedMessageV3.parseWithIOException(D, (CodedInputStream)codedInputStream);
    }

    public static nU a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nU)GeneratedMessageV3.parseWithIOException(D, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public nW ap() {
        return nU.aq();
    }

    public static nW aq() {
        return ak.ar();
    }

    public static nW a(nU nU2) {
        return ak.ar().a(nU2);
    }

    public nW ar() {
        return this == ak ? new nW() : new nW().a(this);
    }

    protected nW a(GeneratedMessageV3.BuilderParent builderParent) {
        nW nW2 = new nW(builderParent);
        return nW2;
    }

    public static nU as() {
        return ak;
    }

    public static Parser<nU> at() {
        return D;
    }

    public Parser<nU> getParserForType() {
        return D;
    }

    public nU au() {
        return ak;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.ar();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.ap();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.ar();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.ap();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.au();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.au();
    }

    static /* synthetic */ boolean av() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(nU nU2) {
        return nU2.unknownFields;
    }
}

