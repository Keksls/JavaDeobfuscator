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

/*
 * Renamed from lG
 */
public final class lg_0
extends GeneratedMessageV3
implements lJ {
    private static final long l = 0L;
    int m;
    public static final int a = 1;
    int n;
    public static final int b = 2;
    volatile Object o;
    public static final int c = 3;
    int p;
    public static final int d = 4;
    int q;
    public static final int e = 5;
    int r;
    public static final int f = 6;
    int s;
    public static final int g = 7;
    long t;
    public static final int h = 8;
    long u;
    public static final int i = 9;
    int v;
    public static final int j = 10;
    long w;
    private byte x = (byte)-1;
    private static final lg_0 y = new lg_0();
    @Deprecated
    public static final Parser<lg_0> k = new lH();

    lg_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private lg_0() {
        this.n = 0;
        this.o = "";
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0L;
        this.u = 0L;
        this.v = 0;
        this.w = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    lg_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block19: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block19;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block19;
                        bl2 = true;
                        continue block19;
                    }
                    case 8: {
                        this.m |= 1;
                        this.n = codedInputStream.readInt32();
                        continue block19;
                    }
                    case 18: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.m |= 2;
                        this.o = byteString;
                        continue block19;
                    }
                    case 24: {
                        this.m |= 4;
                        this.p = codedInputStream.readInt32();
                        continue block19;
                    }
                    case 32: {
                        this.m |= 8;
                        this.q = codedInputStream.readInt32();
                        continue block19;
                    }
                    case 40: {
                        this.m |= 0x10;
                        this.r = codedInputStream.readInt32();
                        continue block19;
                    }
                    case 48: {
                        this.m |= 0x20;
                        this.s = codedInputStream.readInt32();
                        continue block19;
                    }
                    case 56: {
                        this.m |= 0x40;
                        this.t = codedInputStream.readInt64();
                        continue block19;
                    }
                    case 64: {
                        this.m |= 0x80;
                        this.u = codedInputStream.readInt64();
                        continue block19;
                    }
                    case 72: {
                        this.m |= 0x100;
                        this.v = codedInputStream.readInt32();
                        continue block19;
                    }
                    case 80: 
                }
                this.m |= 0x200;
                this.w = codedInputStream.readInt64();
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
        return kM.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kM.d.ensureFieldAccessorsInitialized(lg_0.class, li_0.class);
    }

    @Override
    public boolean b() {
        return (this.m & 1) == 1;
    }

    @Override
    public int c() {
        return this.n;
    }

    @Override
    public boolean d() {
        return (this.m & 2) == 2;
    }

    @Override
    public String e() {
        Object object = this.o;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.o = string;
        }
        return string;
    }

    @Override
    public ByteString f() {
        Object object = this.o;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.o = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean g() {
        return (this.m & 4) == 4;
    }

    @Override
    public int h() {
        return this.p;
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
    public int l() {
        return this.r;
    }

    @Override
    public boolean m() {
        return (this.m & 0x20) == 32;
    }

    @Override
    public int n() {
        return this.s;
    }

    @Override
    public boolean o() {
        return (this.m & 0x40) == 64;
    }

    @Override
    public long p() {
        return this.t;
    }

    @Override
    public boolean q() {
        return (this.m & 0x80) == 128;
    }

    @Override
    public long r() {
        return this.u;
    }

    @Override
    public boolean s() {
        return (this.m & 0x100) == 256;
    }

    @Override
    public int t() {
        return this.v;
    }

    @Override
    public boolean u() {
        return (this.m & 0x200) == 512;
    }

    @Override
    public long v() {
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
        if (!this.g()) {
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
        if (!this.o()) {
            this.x = 0;
            return false;
        }
        if (!this.q()) {
            this.x = 0;
            return false;
        }
        if (!this.s()) {
            this.x = 0;
            return false;
        }
        if (!this.u()) {
            this.x = 0;
            return false;
        }
        this.x = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.m & 1) == 1) {
            codedOutputStream.writeInt32(1, this.n);
        }
        if ((this.m & 2) == 2) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.o);
        }
        if ((this.m & 4) == 4) {
            codedOutputStream.writeInt32(3, this.p);
        }
        if ((this.m & 8) == 8) {
            codedOutputStream.writeInt32(4, this.q);
        }
        if ((this.m & 0x10) == 16) {
            codedOutputStream.writeInt32(5, this.r);
        }
        if ((this.m & 0x20) == 32) {
            codedOutputStream.writeInt32(6, this.s);
        }
        if ((this.m & 0x40) == 64) {
            codedOutputStream.writeInt64(7, this.t);
        }
        if ((this.m & 0x80) == 128) {
            codedOutputStream.writeInt64(8, this.u);
        }
        if ((this.m & 0x100) == 256) {
            codedOutputStream.writeInt32(9, this.v);
        }
        if ((this.m & 0x200) == 512) {
            codedOutputStream.writeInt64(10, this.w);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.n);
        }
        if ((this.m & 2) == 2) {
            n += GeneratedMessageV3.computeStringSize((int)2, (Object)this.o);
        }
        if ((this.m & 4) == 4) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.p);
        }
        if ((this.m & 8) == 8) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.q);
        }
        if ((this.m & 0x10) == 16) {
            n += CodedOutputStream.computeInt32Size((int)5, (int)this.r);
        }
        if ((this.m & 0x20) == 32) {
            n += CodedOutputStream.computeInt32Size((int)6, (int)this.s);
        }
        if ((this.m & 0x40) == 64) {
            n += CodedOutputStream.computeInt64Size((int)7, (long)this.t);
        }
        if ((this.m & 0x80) == 128) {
            n += CodedOutputStream.computeInt64Size((int)8, (long)this.u);
        }
        if ((this.m & 0x100) == 256) {
            n += CodedOutputStream.computeInt32Size((int)9, (int)this.v);
        }
        if ((this.m & 0x200) == 512) {
            n += CodedOutputStream.computeInt64Size((int)10, (long)this.w);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof lg_0)) {
            return super.equals(object);
        }
        lg_0 lg_02 = (lg_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == lg_02.b();
        if (this.b()) {
            bl = bl && this.c() == lg_02.c();
        }
        boolean bl3 = bl = bl && this.d() == lg_02.d();
        if (this.d()) {
            bl = bl && this.e().equals(lg_02.e());
        }
        boolean bl4 = bl = bl && this.g() == lg_02.g();
        if (this.g()) {
            bl = bl && this.h() == lg_02.h();
        }
        boolean bl5 = bl = bl && this.i() == lg_02.i();
        if (this.i()) {
            bl = bl && this.j() == lg_02.j();
        }
        boolean bl6 = bl = bl && this.k() == lg_02.k();
        if (this.k()) {
            bl = bl && this.l() == lg_02.l();
        }
        boolean bl7 = bl = bl && this.m() == lg_02.m();
        if (this.m()) {
            bl = bl && this.n() == lg_02.n();
        }
        boolean bl8 = bl = bl && this.o() == lg_02.o();
        if (this.o()) {
            bl = bl && this.p() == lg_02.p();
        }
        boolean bl9 = bl = bl && this.q() == lg_02.q();
        if (this.q()) {
            bl = bl && this.r() == lg_02.r();
        }
        boolean bl10 = bl = bl && this.s() == lg_02.s();
        if (this.s()) {
            bl = bl && this.t() == lg_02.t();
        }
        boolean bl11 = bl = bl && this.u() == lg_02.u();
        if (this.u()) {
            bl = bl && this.v() == lg_02.v();
        }
        bl = bl && this.unknownFields.equals((Object)lg_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + lg_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c();
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e().hashCode();
        }
        if (this.g()) {
            n = 37 * n + 3;
            n = 53 * n + this.h();
        }
        if (this.i()) {
            n = 37 * n + 4;
            n = 53 * n + this.j();
        }
        if (this.k()) {
            n = 37 * n + 5;
            n = 53 * n + this.l();
        }
        if (this.m()) {
            n = 37 * n + 6;
            n = 53 * n + this.n();
        }
        if (this.o()) {
            n = 37 * n + 7;
            n = 53 * n + Internal.hashLong((long)this.p());
        }
        if (this.q()) {
            n = 37 * n + 8;
            n = 53 * n + Internal.hashLong((long)this.r());
        }
        if (this.s()) {
            n = 37 * n + 9;
            n = 53 * n + this.t();
        }
        if (this.u()) {
            n = 37 * n + 10;
            n = 53 * n + Internal.hashLong((long)this.v());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static lg_0 a(ByteBuffer byteBuffer) {
        return (lg_0)k.parseFrom(byteBuffer);
    }

    public static lg_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (lg_0)k.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static lg_0 a(ByteString byteString) {
        return (lg_0)k.parseFrom(byteString);
    }

    public static lg_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (lg_0)k.parseFrom(byteString, extensionRegistryLite);
    }

    public static lg_0 a(byte[] byArray) {
        return (lg_0)k.parseFrom(byArray);
    }

    public static lg_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (lg_0)k.parseFrom(byArray, extensionRegistryLite);
    }

    public static lg_0 a(InputStream inputStream) {
        return (lg_0)GeneratedMessageV3.parseWithIOException(k, (InputStream)inputStream);
    }

    public static lg_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lg_0)GeneratedMessageV3.parseWithIOException(k, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lg_0 b(InputStream inputStream) {
        return (lg_0)GeneratedMessageV3.parseDelimitedWithIOException(k, (InputStream)inputStream);
    }

    public static lg_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lg_0)GeneratedMessageV3.parseDelimitedWithIOException(k, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lg_0 a(CodedInputStream codedInputStream) {
        return (lg_0)GeneratedMessageV3.parseWithIOException(k, (CodedInputStream)codedInputStream);
    }

    public static lg_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lg_0)GeneratedMessageV3.parseWithIOException(k, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public li_0 w() {
        return lg_0.x();
    }

    public static li_0 x() {
        return y.y();
    }

    public static li_0 a(lg_0 lg_02) {
        return y.y().a(lg_02);
    }

    public li_0 y() {
        return this == y ? new li_0() : new li_0().a(this);
    }

    protected li_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        li_0 li_02 = new li_0(builderParent);
        return li_02;
    }

    public static lg_0 z() {
        return y;
    }

    public static Parser<lg_0> A() {
        return k;
    }

    public Parser<lg_0> getParserForType() {
        return k;
    }

    public lg_0 B() {
        return y;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.y();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.w();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.y();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.w();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.B();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.B();
    }

    static /* synthetic */ boolean C() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(lg_0 lg_02) {
        return lg_02.unknownFields;
    }
}

