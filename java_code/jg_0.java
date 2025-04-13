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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from jg
 */
public final class jg_0
extends GeneratedMessageV3
implements jj_0 {
    private static final long l = 0L;
    int m;
    public static final int a = 1;
    long n;
    public static final int b = 2;
    long o;
    public static final int c = 3;
    volatile Object p;
    public static final int d = 4;
    int q;
    public static final int e = 5;
    boolean r;
    public static final int f = 6;
    boolean s;
    public static final int g = 7;
    List<iy_0> t;
    public static final int h = 8;
    ja_0 u;
    public static final int i = 9;
    int v;
    public static final int j = 10;
    boolean w;
    private byte x = (byte)-1;
    private static final jg_0 y = new jg_0();
    @Deprecated
    public static final Parser<jg_0> k = new jh_0();

    jg_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private jg_0() {
        this.n = 0L;
        this.o = 0L;
        this.p = "";
        this.q = 0;
        this.r = false;
        this.s = false;
        this.t = Collections.emptyList();
        this.v = 0;
        this.w = false;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    jg_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block19: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block19;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue block19;
                        bl = true;
                        continue block19;
                    }
                    case 8: {
                        this.m |= 1;
                        this.n = codedInputStream.readInt64();
                        continue block19;
                    }
                    case 16: {
                        this.m |= 2;
                        this.o = codedInputStream.readInt64();
                        continue block19;
                    }
                    case 26: {
                        Object object = codedInputStream.readBytes();
                        this.m |= 4;
                        this.p = object;
                        continue block19;
                    }
                    case 32: {
                        this.m |= 8;
                        this.q = codedInputStream.readInt32();
                        continue block19;
                    }
                    case 40: {
                        this.m |= 0x10;
                        this.r = codedInputStream.readBool();
                        continue block19;
                    }
                    case 48: {
                        this.m |= 0x20;
                        this.s = codedInputStream.readBool();
                        continue block19;
                    }
                    case 58: {
                        if ((n & 0x40) != 64) {
                            this.t = new ArrayList<iy_0>();
                            n |= 0x40;
                        }
                        this.t.add((iy_0)codedInputStream.readMessage(iy_0.e, extensionRegistryLite));
                        continue block19;
                    }
                    case 66: {
                        Object object = null;
                        if ((this.m & 0x40) == 64) {
                            object = this.u.r();
                        }
                        this.u = (ja_0)codedInputStream.readMessage(ja_0.h, extensionRegistryLite);
                        if (object != null) {
                            ((jC)object).a(this.u);
                            this.u = ((jC)object).s();
                        }
                        this.m |= 0x40;
                        continue block19;
                    }
                    case 72: {
                        this.m |= 0x80;
                        this.v = codedInputStream.readInt32();
                        continue block19;
                    }
                    case 80: 
                }
                this.m |= 0x100;
                this.w = codedInputStream.readBool();
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if ((n & 0x40) == 64) {
                this.t = Collections.unmodifiableList(this.t);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return iw_0.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iw_0.f.ensureFieldAccessorsInitialized(jg_0.class, ji_0.class);
    }

    @Override
    public boolean b() {
        return (this.m & 1) == 1;
    }

    @Override
    public long c() {
        return this.n;
    }

    @Override
    public boolean d() {
        return (this.m & 2) == 2;
    }

    @Override
    public long e() {
        return this.o;
    }

    @Override
    public boolean f() {
        return (this.m & 4) == 4;
    }

    @Override
    public String g() {
        Object object = this.p;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.p = string;
        }
        return string;
    }

    @Override
    public ByteString h() {
        Object object = this.p;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.p = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean i() {
        return (this.m & 8) == 8;
    }

    @Override
    public int j() {
        return this.q;
    }

    @Override
    public boolean k() {
        return (this.m & 0x10) == 16;
    }

    @Override
    public boolean l() {
        return this.r;
    }

    @Override
    public boolean m() {
        return (this.m & 0x20) == 32;
    }

    @Override
    public boolean n() {
        return this.s;
    }

    @Override
    public List<iy_0> o() {
        return this.t;
    }

    @Override
    public List<? extends jb_0> p() {
        return this.t;
    }

    @Override
    public int q() {
        return this.t.size();
    }

    @Override
    public iy_0 a(int n) {
        return this.t.get(n);
    }

    @Override
    public jb_0 b(int n) {
        return this.t.get(n);
    }

    @Override
    public boolean r() {
        return (this.m & 0x40) == 64;
    }

    @Override
    public ja_0 s() {
        return this.u == null ? ja_0.s() : this.u;
    }

    @Override
    public jD t() {
        return this.u == null ? ja_0.s() : this.u;
    }

    @Override
    public boolean u() {
        return (this.m & 0x80) == 128;
    }

    @Override
    public int v() {
        return this.v;
    }

    @Override
    public boolean w() {
        return (this.m & 0x100) == 256;
    }

    @Override
    public boolean x() {
        return this.w;
    }

    public final boolean isInitialized() {
        byte by = this.x;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.x = 0;
            return false;
        }
        if (!this.d()) {
            this.x = 0;
            return false;
        }
        if (!this.f()) {
            this.x = 0;
            return false;
        }
        if (!this.i()) {
            this.x = 0;
            return false;
        }
        if (!this.k()) {
            this.x = 0;
            return false;
        }
        if (!this.m()) {
            this.x = 0;
            return false;
        }
        for (int k = 0; k < this.q(); ++k) {
            if (this.a(k).isInitialized()) continue;
            this.x = 0;
            return false;
        }
        this.x = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.m & 1) == 1) {
            codedOutputStream.writeInt64(1, this.n);
        }
        if ((this.m & 2) == 2) {
            codedOutputStream.writeInt64(2, this.o);
        }
        if ((this.m & 4) == 4) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)3, (Object)this.p);
        }
        if ((this.m & 8) == 8) {
            codedOutputStream.writeInt32(4, this.q);
        }
        if ((this.m & 0x10) == 16) {
            codedOutputStream.writeBool(5, this.r);
        }
        if ((this.m & 0x20) == 32) {
            codedOutputStream.writeBool(6, this.s);
        }
        for (int k = 0; k < this.t.size(); ++k) {
            codedOutputStream.writeMessage(7, (MessageLite)this.t.get(k));
        }
        if ((this.m & 0x40) == 64) {
            codedOutputStream.writeMessage(8, (MessageLite)this.s());
        }
        if ((this.m & 0x80) == 128) {
            codedOutputStream.writeInt32(9, this.v);
        }
        if ((this.m & 0x100) == 256) {
            codedOutputStream.writeBool(10, this.w);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.m & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.n);
        }
        if ((this.m & 2) == 2) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.o);
        }
        if ((this.m & 4) == 4) {
            n += GeneratedMessageV3.computeStringSize((int)3, (Object)this.p);
        }
        if ((this.m & 8) == 8) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.q);
        }
        if ((this.m & 0x10) == 16) {
            n += CodedOutputStream.computeBoolSize((int)5, (boolean)this.r);
        }
        if ((this.m & 0x20) == 32) {
            n += CodedOutputStream.computeBoolSize((int)6, (boolean)this.s);
        }
        for (int k = 0; k < this.t.size(); ++k) {
            n += CodedOutputStream.computeMessageSize((int)7, (MessageLite)((MessageLite)this.t.get(k)));
        }
        if ((this.m & 0x40) == 64) {
            n += CodedOutputStream.computeMessageSize((int)8, (MessageLite)this.s());
        }
        if ((this.m & 0x80) == 128) {
            n += CodedOutputStream.computeInt32Size((int)9, (int)this.v);
        }
        if ((this.m & 0x100) == 256) {
            n += CodedOutputStream.computeBoolSize((int)10, (boolean)this.w);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof jg_0)) {
            return super.equals(object);
        }
        jg_0 jg_02 = (jg_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == jg_02.b();
        if (this.b()) {
            bl = bl && this.c() == jg_02.c();
        }
        boolean bl3 = bl = bl && this.d() == jg_02.d();
        if (this.d()) {
            bl = bl && this.e() == jg_02.e();
        }
        boolean bl4 = bl = bl && this.f() == jg_02.f();
        if (this.f()) {
            bl = bl && this.g().equals(jg_02.g());
        }
        boolean bl5 = bl = bl && this.i() == jg_02.i();
        if (this.i()) {
            bl = bl && this.j() == jg_02.j();
        }
        boolean bl6 = bl = bl && this.k() == jg_02.k();
        if (this.k()) {
            bl = bl && this.l() == jg_02.l();
        }
        boolean bl7 = bl = bl && this.m() == jg_02.m();
        if (this.m()) {
            bl = bl && this.n() == jg_02.n();
        }
        bl = bl && this.o().equals(jg_02.o());
        boolean bl8 = bl = bl && this.r() == jg_02.r();
        if (this.r()) {
            bl = bl && this.s().equals(jg_02.s());
        }
        boolean bl9 = bl = bl && this.u() == jg_02.u();
        if (this.u()) {
            bl = bl && this.v() == jg_02.v();
        }
        boolean bl10 = bl = bl && this.w() == jg_02.w();
        if (this.w()) {
            bl = bl && this.x() == jg_02.x();
        }
        bl = bl && this.unknownFields.equals((Object)jg_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + jg_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.e());
        }
        if (this.f()) {
            n = 37 * n + 3;
            n = 53 * n + this.g().hashCode();
        }
        if (this.i()) {
            n = 37 * n + 4;
            n = 53 * n + this.j();
        }
        if (this.k()) {
            n = 37 * n + 5;
            n = 53 * n + Internal.hashBoolean((boolean)this.l());
        }
        if (this.m()) {
            n = 37 * n + 6;
            n = 53 * n + Internal.hashBoolean((boolean)this.n());
        }
        if (this.q() > 0) {
            n = 37 * n + 7;
            n = 53 * n + this.o().hashCode();
        }
        if (this.r()) {
            n = 37 * n + 8;
            n = 53 * n + this.s().hashCode();
        }
        if (this.u()) {
            n = 37 * n + 9;
            n = 53 * n + this.v();
        }
        if (this.w()) {
            n = 37 * n + 10;
            n = 53 * n + Internal.hashBoolean((boolean)this.x());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static jg_0 a(ByteBuffer byteBuffer) {
        return (jg_0)k.parseFrom(byteBuffer);
    }

    public static jg_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (jg_0)k.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static jg_0 a(ByteString byteString) {
        return (jg_0)k.parseFrom(byteString);
    }

    public static jg_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (jg_0)k.parseFrom(byteString, extensionRegistryLite);
    }

    public static jg_0 a(byte[] byArray) {
        return (jg_0)k.parseFrom(byArray);
    }

    public static jg_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (jg_0)k.parseFrom(byArray, extensionRegistryLite);
    }

    public static jg_0 a(InputStream inputStream) {
        return (jg_0)GeneratedMessageV3.parseWithIOException(k, (InputStream)inputStream);
    }

    public static jg_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jg_0)GeneratedMessageV3.parseWithIOException(k, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jg_0 b(InputStream inputStream) {
        return (jg_0)GeneratedMessageV3.parseDelimitedWithIOException(k, (InputStream)inputStream);
    }

    public static jg_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jg_0)GeneratedMessageV3.parseDelimitedWithIOException(k, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jg_0 a(CodedInputStream codedInputStream) {
        return (jg_0)GeneratedMessageV3.parseWithIOException(k, (CodedInputStream)codedInputStream);
    }

    public static jg_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jg_0)GeneratedMessageV3.parseWithIOException(k, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ji_0 y() {
        return jg_0.z();
    }

    public static ji_0 z() {
        return y.A();
    }

    public static ji_0 a(jg_0 jg_02) {
        return y.A().a(jg_02);
    }

    public ji_0 A() {
        return this == y ? new ji_0() : new ji_0().a(this);
    }

    protected ji_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        ji_0 ji_02 = new ji_0(builderParent);
        return ji_02;
    }

    public static jg_0 B() {
        return y;
    }

    public static Parser<jg_0> C() {
        return k;
    }

    public Parser<jg_0> getParserForType() {
        return k;
    }

    public jg_0 D() {
        return y;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.A();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.y();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.A();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.y();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.D();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.D();
    }

    static /* synthetic */ boolean E() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean F() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(jg_0 jg_02) {
        return jg_02.unknownFields;
    }
}

