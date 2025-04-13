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
 * Renamed from v
 */
public final class v_0
extends GeneratedMessageV3
implements y_0 {
    private static final long d = 0L;
    public static final int a = 1;
    volatile Object e;
    public static final int b = 2;
    long f;
    public static final int c = 3;
    volatile Object g;
    private byte h = (byte)-1;
    private static final v_0 i = new v_0();
    static final Parser<v_0> j = new w_0();

    v_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private v_0() {
        this.e = "";
        this.f = 0L;
        this.g = "";
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    v_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                String string;
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    default: {
                        if (this.parseUnknownFieldProto3(codedInputStream, builder, extensionRegistryLite, n)) continue block12;
                        bl2 = true;
                        continue block12;
                    }
                    case 10: {
                        string = codedInputStream.readStringRequireUtf8();
                        this.e = string;
                        continue block12;
                    }
                    case 16: {
                        this.f = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 26: 
                }
                string = codedInputStream.readStringRequireUtf8();
                this.g = string;
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
        return g_0.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return g_0.b.ensureFieldAccessorsInitialized(v_0.class, x_0.class);
    }

    @Override
    public String b() {
        Object object = this.e;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        this.e = string;
        return string;
    }

    @Override
    public ByteString c() {
        Object object = this.e;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.e = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public long d() {
        return this.f;
    }

    @Override
    public String e() {
        Object object = this.g;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        this.g = string;
        return string;
    }

    @Override
    public ByteString f() {
        Object object = this.g;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.g = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public final boolean isInitialized() {
        byte by = this.h;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.c().isEmpty()) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)1, (Object)this.e);
        }
        if (this.f != 0L) {
            codedOutputStream.writeInt64(2, this.f);
        }
        if (!this.f().isEmpty()) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)3, (Object)this.g);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (!this.c().isEmpty()) {
            n += GeneratedMessageV3.computeStringSize((int)1, (Object)this.e);
        }
        if (this.f != 0L) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.f);
        }
        if (!this.f().isEmpty()) {
            n += GeneratedMessageV3.computeStringSize((int)3, (Object)this.g);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof v_0)) {
            return super.equals(object);
        }
        v_0 v_02 = (v_0)object;
        boolean bl = true;
        bl = bl && this.b().equals(v_02.b());
        bl = bl && this.d() == v_02.d();
        bl = bl && this.e().equals(v_02.e());
        bl = bl && this.unknownFields.equals((Object)v_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + v_0.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + this.b().hashCode();
        n = 37 * n + 2;
        n = 53 * n + Internal.hashLong((long)this.d());
        n = 37 * n + 3;
        n = 53 * n + this.e().hashCode();
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static v_0 a(ByteBuffer byteBuffer) {
        return (v_0)j.parseFrom(byteBuffer);
    }

    public static v_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (v_0)j.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static v_0 a(ByteString byteString) {
        return (v_0)j.parseFrom(byteString);
    }

    public static v_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (v_0)j.parseFrom(byteString, extensionRegistryLite);
    }

    public static v_0 a(byte[] byArray) {
        return (v_0)j.parseFrom(byArray);
    }

    public static v_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (v_0)j.parseFrom(byArray, extensionRegistryLite);
    }

    public static v_0 a(InputStream inputStream) {
        return (v_0)GeneratedMessageV3.parseWithIOException(j, (InputStream)inputStream);
    }

    public static v_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (v_0)GeneratedMessageV3.parseWithIOException(j, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static v_0 b(InputStream inputStream) {
        return (v_0)GeneratedMessageV3.parseDelimitedWithIOException(j, (InputStream)inputStream);
    }

    public static v_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (v_0)GeneratedMessageV3.parseDelimitedWithIOException(j, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static v_0 a(CodedInputStream codedInputStream) {
        return (v_0)GeneratedMessageV3.parseWithIOException(j, (CodedInputStream)codedInputStream);
    }

    public static v_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (v_0)GeneratedMessageV3.parseWithIOException(j, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public x_0 g() {
        return v_0.h();
    }

    public static x_0 h() {
        return i.i();
    }

    public static x_0 a(v_0 v_02) {
        return i.i().a(v_02);
    }

    public x_0 i() {
        return this == i ? new x_0() : new x_0().a(this);
    }

    protected x_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        x_0 x_02 = new x_0(builderParent);
        return x_02;
    }

    public static v_0 j() {
        return i;
    }

    public static Parser<v_0> k() {
        return j;
    }

    public Parser<v_0> getParserForType() {
        return j;
    }

    public v_0 l() {
        return i;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.i();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.g();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.l();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.l();
    }

    static /* synthetic */ boolean m() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(v_0 v_02) {
        return v_02.unknownFields;
    }

    static /* synthetic */ void b(ByteString byteString) {
        v_0.checkByteStringIsUtf8((ByteString)byteString);
    }

    static /* synthetic */ void c(ByteString byteString) {
        v_0.checkByteStringIsUtf8((ByteString)byteString);
    }
}

