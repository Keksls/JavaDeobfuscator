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
 * Renamed from J
 */
public final class j_0
extends GeneratedMessageV3.Builder<j_0>
implements p_0 {
    private int a = 0;
    private Object b;
    private long c;
    private SingleFieldBuilderV3<L, N, O> d;

    public static final Descriptors.Descriptor a() {
        return e_0.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return e_0.b.ensureFieldAccessorsInitialized(H.class, j_0.class);
    }

    j_0() {
        this.u();
    }

    j_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.u();
    }

    private void u() {
        if (H.p()) {
            // empty if block
        }
    }

    public j_0 j() {
        super.clear();
        this.c = 0L;
        this.a = 0;
        this.b = null;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return e_0.a;
    }

    public H k() {
        return H.m();
    }

    public H l() {
        H h = this.m();
        if (!h.isInitialized()) {
            throw j_0.newUninitializedMessageException((Message)h);
        }
        return h;
    }

    public H m() {
        H h = new H(this);
        h.h = this.c;
        if (this.a == 2) {
            h.g = this.b;
        }
        if (this.a == 3) {
            h.g = this.b;
        }
        if (this.a == 4) {
            h.g = this.d == null ? this.b : this.d.build();
        }
        h.f = this.a;
        this.onBuilt();
        return h;
    }

    public j_0 n() {
        return (j_0)super.clone();
    }

    public j_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (j_0)super.setField(fieldDescriptor, object);
    }

    public j_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (j_0)super.clearField(fieldDescriptor);
    }

    public j_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (j_0)super.clearOneof(oneofDescriptor);
    }

    public j_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (j_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public j_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (j_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public j_0 a(Message message) {
        if (message instanceof H) {
            return this.a((H)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public j_0 a(H h) {
        if (h == H.m()) {
            return this;
        }
        if (h.c() != 0L) {
            this.a(h.c());
        }
        switch (h.b()) {
            case a: {
                this.b(h.d());
                break;
            }
            case b: {
                this.a = 3;
                this.b = h.g;
                this.onChanged();
                break;
            }
            case c: {
                this.b(h.h());
                break;
            }
        }
        this.b(H.b(h));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public j_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        H h = null;
        try {
            h = (H)H.k.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            h = (H)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (h != null) {
                this.a(h);
            }
        }
        return this;
    }

    @Override
    public K b() {
        return K.b(this.a);
    }

    public j_0 o() {
        this.a = 0;
        this.b = null;
        this.onChanged();
        return this;
    }

    @Override
    public long c() {
        return this.c;
    }

    public j_0 a(long l) {
        this.c = l;
        this.onChanged();
        return this;
    }

    public j_0 p() {
        this.c = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public long d() {
        if (this.a == 2) {
            return (Long)this.b;
        }
        return 0L;
    }

    public j_0 b(long l) {
        this.a = 2;
        this.b = l;
        this.onChanged();
        return this;
    }

    public j_0 q() {
        if (this.a == 2) {
            this.a = 0;
            this.b = null;
            this.onChanged();
        }
        return this;
    }

    @Override
    public String e() {
        Object object = "";
        if (this.a == 3) {
            object = this.b;
        }
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (this.a == 3) {
                this.b = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString f() {
        Object object = "";
        if (this.a == 3) {
            object = this.b;
        }
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            if (this.a == 3) {
                this.b = byteString;
            }
            return byteString;
        }
        return (ByteString)object;
    }

    public j_0 a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a = 3;
        this.b = string;
        this.onChanged();
        return this;
    }

    public j_0 r() {
        if (this.a == 3) {
            this.a = 0;
            this.b = null;
            this.onChanged();
        }
        return this;
    }

    public j_0 a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        H.b(byteString);
        this.a = 3;
        this.b = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean g() {
        return this.a == 4;
    }

    @Override
    public L h() {
        if (this.d == null) {
            if (this.a == 4) {
                return (L)this.b;
            }
            return L.i();
        }
        if (this.a == 4) {
            return (L)this.d.getMessage();
        }
        return L.i();
    }

    public j_0 a(L l) {
        if (this.d == null) {
            if (l == null) {
                throw new NullPointerException();
            }
            this.b = l;
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)l);
        }
        this.a = 4;
        return this;
    }

    public j_0 a(N n) {
        if (this.d == null) {
            this.b = n.h();
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)n.h());
        }
        this.a = 4;
        return this;
    }

    public j_0 b(L l) {
        if (this.d == null) {
            this.b = this.a == 4 && this.b != L.i() ? L.a((L)this.b).a(l).i() : l;
            this.onChanged();
        } else {
            if (this.a == 4) {
                this.d.mergeFrom((AbstractMessage)l);
            }
            this.d.setMessage((AbstractMessage)l);
        }
        this.a = 4;
        return this;
    }

    public j_0 s() {
        if (this.d == null) {
            if (this.a == 4) {
                this.a = 0;
                this.b = null;
                this.onChanged();
            }
        } else {
            if (this.a == 4) {
                this.a = 0;
                this.b = null;
            }
            this.d.clear();
        }
        return this;
    }

    public N t() {
        return (N)this.v().getBuilder();
    }

    @Override
    public O i() {
        if (this.a == 4 && this.d != null) {
            return (O)this.d.getMessageOrBuilder();
        }
        if (this.a == 4) {
            return (L)this.b;
        }
        return L.i();
    }

    private SingleFieldBuilderV3<L, N, O> v() {
        if (this.d == null) {
            if (this.a != 4) {
                this.b = L.i();
            }
            this.d = new SingleFieldBuilderV3((AbstractMessage)((L)this.b), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        this.a = 4;
        this.onChanged();
        return this.d;
    }

    public final j_0 a(UnknownFieldSet unknownFieldSet) {
        return (j_0)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final j_0 b(UnknownFieldSet unknownFieldSet) {
        return (j_0)super.mergeUnknownFields(unknownFieldSet);
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
        return this.j();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.n();
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
        return this.j();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.n();
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
        return this.n();
    }

    public /* synthetic */ Message buildPartial() {
        return this.m();
    }

    public /* synthetic */ Message build() {
        return this.l();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.n();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.m();
    }

    public /* synthetic */ MessageLite build() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.j();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.n();
    }

    public /* synthetic */ Object clone() {
        return this.n();
    }
}

