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
 * Renamed from el
 */
public final class el_0
extends GeneratedMessageV3
implements eo_0 {
    private static final long d = 0L;
    int e;
    public static final int a = 3;
    int f;
    public static final int b = 4;
    List<eh> g;
    private byte h = (byte)-1;
    private static final el_0 i = new el_0();
    @Deprecated
    public static final Parser<el_0> c = new em_0();

    el_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private el_0() {
        this.f = 0;
        this.g = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    el_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block11: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block11;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue block11;
                        bl = true;
                        continue block11;
                    }
                    case 24: {
                        this.e |= 1;
                        this.f = codedInputStream.readInt32();
                        continue block11;
                    }
                    case 34: 
                }
                if ((n & 2) != 2) {
                    this.g = new ArrayList<eh>();
                    n |= 2;
                }
                this.g.add((eh)codedInputStream.readMessage(eh.c, extensionRegistryLite));
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if ((n & 2) == 2) {
                this.g = Collections.unmodifiableList(this.g);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return ef.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ef.f.ensureFieldAccessorsInitialized(el_0.class, en_0.class);
    }

    @Override
    public boolean b() {
        return (this.e & 1) == 1;
    }

    @Override
    public int c() {
        return this.f;
    }

    @Override
    public List<eh> d() {
        return this.g;
    }

    @Override
    public List<? extends ek_0> e() {
        return this.g;
    }

    @Override
    public int f() {
        return this.g.size();
    }

    @Override
    public eh a(int n) {
        return this.g.get(n);
    }

    @Override
    public ek_0 b(int n) {
        return this.g.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.h;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int k = 0; k < this.f(); ++k) {
            if (this.a(k).isInitialized()) continue;
            this.h = 0;
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.e & 1) == 1) {
            codedOutputStream.writeInt32(3, this.f);
        }
        for (int k = 0; k < this.g.size(); ++k) {
            codedOutputStream.writeMessage(4, (MessageLite)this.g.get(k));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.e & 1) == 1) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.f);
        }
        for (int k = 0; k < this.g.size(); ++k) {
            n += CodedOutputStream.computeMessageSize((int)4, (MessageLite)((MessageLite)this.g.get(k)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof el_0)) {
            return super.equals(object);
        }
        el_0 el_02 = (el_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == el_02.b();
        if (this.b()) {
            bl = bl && this.c() == el_02.c();
        }
        bl = bl && this.d().equals(el_02.d());
        bl = bl && this.unknownFields.equals((Object)el_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + el_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 3;
            n = 53 * n + this.c();
        }
        if (this.f() > 0) {
            n = 37 * n + 4;
            n = 53 * n + this.d().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static el_0 a(ByteBuffer byteBuffer) {
        return (el_0)c.parseFrom(byteBuffer);
    }

    public static el_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (el_0)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static el_0 a(ByteString byteString) {
        return (el_0)c.parseFrom(byteString);
    }

    public static el_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (el_0)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static el_0 a(byte[] byArray) {
        return (el_0)c.parseFrom(byArray);
    }

    public static el_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (el_0)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static el_0 a(InputStream inputStream) {
        return (el_0)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static el_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (el_0)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static el_0 b(InputStream inputStream) {
        return (el_0)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static el_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (el_0)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static el_0 a(CodedInputStream codedInputStream) {
        return (el_0)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static el_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (el_0)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public en_0 g() {
        return el_0.h();
    }

    public static en_0 h() {
        return i.i();
    }

    public static en_0 a(el_0 el_02) {
        return i.i().a(el_02);
    }

    public en_0 i() {
        return this == i ? new en_0() : new en_0().a(this);
    }

    protected en_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        en_0 en_02 = new en_0(builderParent);
        return en_02;
    }

    public static el_0 j() {
        return i;
    }

    public static Parser<el_0> k() {
        return c;
    }

    public Parser<el_0> getParserForType() {
        return c;
    }

    public el_0 l() {
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

    static /* synthetic */ boolean n() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(el_0 el_02) {
        return el_02.unknownFields;
    }
}

