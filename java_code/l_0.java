/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from l
 */
public final class l_0
extends GeneratedMessageV3.Builder<l_0>
implements u_0 {
    private Object a = "";
    private Object b = "";
    private long c;
    private Object d = "";
    private cd_2 e = null;
    private SingleFieldBuilderV3<cd_2, cf_2, cq_1> f;

    public static final Descriptors.Descriptor a() {
        return g_0.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return g_0.h.ensureFieldAccessorsInitialized(j.class, l_0.class);
    }

    l_0() {
        this.w();
    }

    l_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.w();
    }

    private void w() {
        if (j.r()) {
            // empty if block
        }
    }

    public l_0 l() {
        super.clear();
        this.a = "";
        this.b = "";
        this.c = 0L;
        this.d = "";
        if (this.f == null) {
            this.e = null;
        } else {
            this.e = null;
            this.f = null;
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return g_0.g;
    }

    public j m() {
        return j.o();
    }

    public j n() {
        j j2 = this.o();
        if (!j2.isInitialized()) {
            throw l_0.newUninitializedMessageException((Message)j2);
        }
        return j2;
    }

    public j o() {
        j j2 = new j(this);
        j2.g = this.a;
        j2.h = this.b;
        j2.i = this.c;
        j2.j = this.d;
        j2.k = this.f == null ? this.e : (cd_2)this.f.build();
        this.onBuilt();
        return j2;
    }

    public l_0 p() {
        return (l_0)super.clone();
    }

    public l_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (l_0)super.setField(fieldDescriptor, object);
    }

    public l_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (l_0)super.clearField(fieldDescriptor);
    }

    public l_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (l_0)super.clearOneof(oneofDescriptor);
    }

    public l_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (l_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public l_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (l_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public l_0 a(Message message) {
        if (message instanceof j) {
            return this.a((j)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public l_0 a(j j2) {
        if (j2 == j.o()) {
            return this;
        }
        if (!j2.b().isEmpty()) {
            this.a = j2.g;
            this.onChanged();
        }
        if (!j2.d().isEmpty()) {
            this.b = j2.h;
            this.onChanged();
        }
        if (j2.f() != 0L) {
            this.a(j2.f());
        }
        if (!j2.g().isEmpty()) {
            this.d = j2.j;
            this.onChanged();
        }
        if (j2.i()) {
            this.b(j2.j());
        }
        this.b(j.b(j2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public l_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        j j2 = null;
        try {
            j2 = (j)j.n.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            j2 = (j)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (j2 != null) {
                this.a(j2);
            }
        }
        return this;
    }

    @Override
    public String b() {
        Object object = this.a;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            this.a = string;
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString c() {
        Object object = this.a;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.a = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public l_0 a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a = string;
        this.onChanged();
        return this;
    }

    public l_0 q() {
        this.a = j.o().b();
        this.onChanged();
        return this;
    }

    public l_0 a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        j.b(byteString);
        this.a = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public String d() {
        Object object = this.b;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            this.b = string;
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString e() {
        Object object = this.b;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.b = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public l_0 b(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.b = string;
        this.onChanged();
        return this;
    }

    public l_0 r() {
        this.b = j.o().d();
        this.onChanged();
        return this;
    }

    public l_0 b(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        j.c(byteString);
        this.b = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public long f() {
        return this.c;
    }

    public l_0 a(long l) {
        this.c = l;
        this.onChanged();
        return this;
    }

    public l_0 s() {
        this.c = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public String g() {
        Object object = this.d;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            this.d = string;
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString h() {
        Object object = this.d;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.d = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public l_0 c(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.d = string;
        this.onChanged();
        return this;
    }

    public l_0 t() {
        this.d = j.o().g();
        this.onChanged();
        return this;
    }

    public l_0 c(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        j.d(byteString);
        this.d = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean i() {
        return this.f != null || this.e != null;
    }

    @Override
    public cd_2 j() {
        if (this.f == null) {
            return this.e == null ? cd_2.j() : this.e;
        }
        return (cd_2)this.f.getMessage();
    }

    public l_0 a(cd_2 cd_22) {
        if (this.f == null) {
            if (cd_22 == null) {
                throw new NullPointerException();
            }
            this.e = cd_22;
            this.onChanged();
        } else {
            this.f.setMessage((AbstractMessage)cd_22);
        }
        return this;
    }

    public l_0 a(cf_2 cf_22) {
        if (this.f == null) {
            this.e = cf_22.i();
            this.onChanged();
        } else {
            this.f.setMessage((AbstractMessage)cf_22.i());
        }
        return this;
    }

    public l_0 b(cd_2 cd_22) {
        if (this.f == null) {
            this.e = this.e != null ? cd_2.a(this.e).a(cd_22).j() : cd_22;
            this.onChanged();
        } else {
            this.f.mergeFrom((AbstractMessage)cd_22);
        }
        return this;
    }

    public l_0 u() {
        if (this.f == null) {
            this.e = null;
            this.onChanged();
        } else {
            this.e = null;
            this.f = null;
        }
        return this;
    }

    public cf_2 v() {
        this.onChanged();
        return (cf_2)this.x().getBuilder();
    }

    @Override
    public cq_1 k() {
        if (this.f != null) {
            return (cq_1)this.f.getMessageOrBuilder();
        }
        return this.e == null ? cd_2.j() : this.e;
    }

    private SingleFieldBuilderV3<cd_2, cf_2, cq_1> x() {
        if (this.f == null) {
            this.f = new SingleFieldBuilderV3((AbstractMessage)this.j(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.e = null;
        }
        return this.f;
    }

    public final l_0 a(UnknownFieldSet unknownFieldSet) {
        return (l_0)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final l_0 b(UnknownFieldSet unknownFieldSet) {
        return (l_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.l();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.p();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.l();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.p();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.p();
    }

    public /* synthetic */ Message buildPartial() {
        return this.o();
    }

    public /* synthetic */ Message build() {
        return this.n();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.p();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.o();
    }

    public /* synthetic */ MessageLite build() {
        return this.n();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.l();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.m();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.m();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.p();
    }

    public /* synthetic */ Object clone() {
        return this.p();
    }
}

