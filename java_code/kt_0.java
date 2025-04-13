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
 * Renamed from kt
 */
public final class kt_0
extends GeneratedMessageV3
implements kw_0 {
    private static final long e = 0L;
    int f;
    public static final int a = 1;
    volatile Object g;
    public static final int b = 2;
    long h;
    public static final int c = 3;
    long i;
    private byte j = (byte)-1;
    private static final kt_0 k = new kt_0();
    @Deprecated
    public static final Parser<kt_0> d = new ku_0();

    kt_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private kt_0() {
        this.g = "";
        this.h = 0L;
        this.i = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    kt_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 10: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.f |= 1;
                        this.g = byteString;
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
        return kg.i;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kg.j.ensureFieldAccessorsInitialized(kt_0.class, kv_0.class);
    }

    @Override
    public boolean b() {
        return (this.f & 1) == 1;
    }

    @Override
    public String c() {
        Object object = this.g;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.g = string;
        }
        return string;
    }

    @Override
    public ByteString d() {
        Object object = this.g;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.g = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean e() {
        return (this.f & 2) == 2;
    }

    @Override
    public long f() {
        return this.h;
    }

    @Override
    public boolean g() {
        return (this.f & 4) == 4;
    }

    @Override
    public long h() {
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
        if (!this.e()) {
            this.j = 0;
            return false;
        }
        if (!this.g()) {
            this.j = 0;
            return false;
        }
        this.j = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.f & 1) == 1) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)1, (Object)this.g);
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
            n += GeneratedMessageV3.computeStringSize((int)1, (Object)this.g);
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
        if (!(object instanceof kt_0)) {
            return super.equals(object);
        }
        kt_0 kt_02 = (kt_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == kt_02.b();
        if (this.b()) {
            bl = bl && this.c().equals(kt_02.c());
        }
        boolean bl3 = bl = bl && this.e() == kt_02.e();
        if (this.e()) {
            bl = bl && this.f() == kt_02.f();
        }
        boolean bl4 = bl = bl && this.g() == kt_02.g();
        if (this.g()) {
            bl = bl && this.h() == kt_02.h();
        }
        bl = bl && this.unknownFields.equals((Object)kt_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + kt_0.a().hashCode();
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
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static kt_0 a(ByteBuffer byteBuffer) {
        return (kt_0)d.parseFrom(byteBuffer);
    }

    public static kt_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (kt_0)d.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static kt_0 a(ByteString byteString) {
        return (kt_0)d.parseFrom(byteString);
    }

    public static kt_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (kt_0)d.parseFrom(byteString, extensionRegistryLite);
    }

    public static kt_0 a(byte[] byArray) {
        return (kt_0)d.parseFrom(byArray);
    }

    public static kt_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (kt_0)d.parseFrom(byArray, extensionRegistryLite);
    }

    public static kt_0 a(InputStream inputStream) {
        return (kt_0)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream);
    }

    public static kt_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kt_0)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kt_0 b(InputStream inputStream) {
        return (kt_0)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream);
    }

    public static kt_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kt_0)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kt_0 a(CodedInputStream codedInputStream) {
        return (kt_0)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream);
    }

    public static kt_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kt_0)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public kv_0 i() {
        return kt_0.j();
    }

    public static kv_0 j() {
        return k.k();
    }

    public static kv_0 a(kt_0 kt_02) {
        return k.k().a(kt_02);
    }

    public kv_0 k() {
        return this == k ? new kv_0() : new kv_0().a(this);
    }

    protected kv_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        kv_0 kv_02 = new kv_0(builderParent);
        return kv_02;
    }

    public static kt_0 l() {
        return k;
    }

    public static Parser<kt_0> m() {
        return d;
    }

    public Parser<kt_0> getParserForType() {
        return d;
    }

    public kt_0 n() {
        return k;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.k();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.k();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.i();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.n();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.n();
    }

    static /* synthetic */ boolean o() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(kt_0 kt_02) {
        return kt_02.unknownFields;
    }
}

