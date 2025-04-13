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
 * Renamed from jQ
 */
public final class jq_0
extends GeneratedMessageV3
implements jt_0 {
    private static final long e = 0L;
    int f;
    public static final int a = 1;
    int g;
    public static final int b = 2;
    long h;
    public static final int c = 3;
    long i;
    private byte j = (byte)-1;
    private static final jq_0 k = new jq_0();
    @Deprecated
    public static final Parser<jq_0> d = new jr_0();

    jq_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private jq_0() {
        this.g = 0;
        this.h = 0L;
        this.i = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    jq_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block12;
                        bl2 = true;
                        continue block12;
                    }
                    case 8: {
                        this.f |= 1;
                        this.g = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 16: {
                        this.f |= 2;
                        this.h = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 24: 
                }
                this.f |= 4;
                this.i = codedInputStream.readInt64();
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
        return jo_0.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return jo_0.h.ensureFieldAccessorsInitialized(jq_0.class, js_0.class);
    }

    @Override
    public boolean b() {
        return (this.f & 1) == 1;
    }

    @Override
    public int c() {
        return this.g;
    }

    @Override
    public boolean d() {
        return (this.f & 2) == 2;
    }

    @Override
    public long e() {
        return this.h;
    }

    @Override
    public boolean f() {
        return (this.f & 4) == 4;
    }

    @Override
    public long g() {
        return this.i;
    }

    public final boolean isInitialized() {
        byte by = this.j;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.j = 0;
            return false;
        }
        if (!this.d()) {
            this.j = 0;
            return false;
        }
        if (!this.f()) {
            this.j = 0;
            return false;
        }
        this.j = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.f & 1) == 1) {
            codedOutputStream.writeInt32(1, this.g);
        }
        if ((this.f & 2) == 2) {
            codedOutputStream.writeInt64(2, this.h);
        }
        if ((this.f & 4) == 4) {
            codedOutputStream.writeInt64(3, this.i);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.f & 1) == 1) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.g);
        }
        if ((this.f & 2) == 2) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.h);
        }
        if ((this.f & 4) == 4) {
            n += CodedOutputStream.computeInt64Size((int)3, (long)this.i);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof jq_0)) {
            return super.equals(object);
        }
        jq_0 jq_02 = (jq_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == jq_02.b();
        if (this.b()) {
            bl = bl && this.c() == jq_02.c();
        }
        boolean bl3 = bl = bl && this.d() == jq_02.d();
        if (this.d()) {
            bl = bl && this.e() == jq_02.e();
        }
        boolean bl4 = bl = bl && this.f() == jq_02.f();
        if (this.f()) {
            bl = bl && this.g() == jq_02.g();
        }
        bl = bl && this.unknownFields.equals((Object)jq_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + jq_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c();
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.e());
        }
        if (this.f()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashLong((long)this.g());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static jq_0 a(ByteBuffer byteBuffer) {
        return (jq_0)d.parseFrom(byteBuffer);
    }

    public static jq_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (jq_0)d.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static jq_0 a(ByteString byteString) {
        return (jq_0)d.parseFrom(byteString);
    }

    public static jq_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (jq_0)d.parseFrom(byteString, extensionRegistryLite);
    }

    public static jq_0 a(byte[] byArray) {
        return (jq_0)d.parseFrom(byArray);
    }

    public static jq_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (jq_0)d.parseFrom(byArray, extensionRegistryLite);
    }

    public static jq_0 a(InputStream inputStream) {
        return (jq_0)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream);
    }

    public static jq_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jq_0)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jq_0 b(InputStream inputStream) {
        return (jq_0)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream);
    }

    public static jq_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jq_0)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jq_0 a(CodedInputStream codedInputStream) {
        return (jq_0)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream);
    }

    public static jq_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jq_0)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public js_0 h() {
        return jq_0.i();
    }

    public static js_0 i() {
        return k.j();
    }

    public static js_0 a(jq_0 jq_02) {
        return k.j().a(jq_02);
    }

    public js_0 j() {
        return this == k ? new js_0() : new js_0().a(this);
    }

    protected js_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        js_0 js_02 = new js_0(builderParent);
        return js_02;
    }

    public static jq_0 k() {
        return k;
    }

    public static Parser<jq_0> l() {
        return d;
    }

    public Parser<jq_0> getParserForType() {
        return d;
    }

    public jq_0 m() {
        return k;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.j();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.h();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.m();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.m();
    }

    static /* synthetic */ boolean n() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(jq_0 jq_02) {
        return jq_02.unknownFields;
    }
}

