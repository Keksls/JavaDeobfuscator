/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
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
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class hV
extends GeneratedMessageV3.Builder<hV>
implements hw_0 {
    private int a;
    private List<ib_0> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<ib_0, id, if> c;

    public static final Descriptors.Descriptor a() {
        return hR.i;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hR.j.ensureFieldAccessorsInitialized(hT.class, hV.class);
    }

    hV() {
        this.m();
    }

    hV(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (hT.k()) {
            this.o();
        }
    }

    public hV e() {
        super.clear();
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
        } else {
            this.c.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return hR.i;
    }

    public hT f() {
        return hT.h();
    }

    public hT g() {
        hT hT2 = this.h();
        if (!hT2.isInitialized()) {
            throw hV.newUninitializedMessageException((Message)hT2);
        }
        return hT2;
    }

    public hT h() {
        hT hT2 = new hT(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            hT2.d = this.b;
        } else {
            hT2.d = this.c.build();
        }
        this.onBuilt();
        return hT2;
    }

    public hV i() {
        return (hV)super.clone();
    }

    public hV a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hV)super.setField(fieldDescriptor, object);
    }

    public hV a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (hV)super.clearField(fieldDescriptor);
    }

    public hV a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (hV)super.clearOneof(oneofDescriptor);
    }

    public hV a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (hV)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public hV b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hV)super.addRepeatedField(fieldDescriptor, object);
    }

    public hV a(Message message) {
        if (message instanceof hT) {
            return this.a((hT)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public hV a(hT hT2) {
        if (hT2 == hT.h()) {
            return this;
        }
        if (this.c == null) {
            if (!hT2.d.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = hT2.d;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(hT2.d);
                }
                this.onChanged();
            }
        } else if (!hT2.d.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = hT2.d;
                this.a &= 0xFFFFFFFE;
                this.c = hT.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(hT2.d);
            }
        }
        this.b(hT.b(hT2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public hV a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        hT hT2 = null;
        try {
            hT2 = (hT)hT.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            hT2 = (hT)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (hT2 != null) {
                this.a(hT2);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<ib_0>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<ib_0> b() {
        if (this.c == null) {
            return Collections.unmodifiableList(this.b);
        }
        return this.c.getMessageList();
    }

    @Override
    public int d() {
        if (this.c == null) {
            return this.b.size();
        }
        return this.c.getCount();
    }

    @Override
    public ib_0 a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (ib_0)this.c.getMessage(n);
    }

    public hV a(int n, ib_0 ib_02) {
        if (this.c == null) {
            if (ib_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, ib_02);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)ib_02);
        }
        return this;
    }

    public hV a(int n, id id2) {
        if (this.c == null) {
            this.n();
            this.b.set(n, id2.i());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)id2.i());
        }
        return this;
    }

    public hV a(ib_0 ib_02) {
        if (this.c == null) {
            if (ib_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(ib_02);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)ib_02);
        }
        return this;
    }

    public hV b(int n, ib_0 ib_02) {
        if (this.c == null) {
            if (ib_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, ib_02);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)ib_02);
        }
        return this;
    }

    public hV a(id id2) {
        if (this.c == null) {
            this.n();
            this.b.add(id2.i());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)id2.i());
        }
        return this;
    }

    public hV b(int n, id id2) {
        if (this.c == null) {
            this.n();
            this.b.add(n, id2.i());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)id2.i());
        }
        return this;
    }

    public hV a(Iterable<? extends ib_0> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public hV j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public hV c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public id d(int n) {
        return (id)this.o().getBuilder(n);
    }

    @Override
    public if b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (if)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends if> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public id k() {
        return (id)this.o().addBuilder((AbstractMessage)ib_0.j());
    }

    public id e(int n) {
        return (id)this.o().addBuilder(n, (AbstractMessage)ib_0.j());
    }

    public List<id> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<ib_0, id, if> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final hV a(UnknownFieldSet unknownFieldSet) {
        return (hV)super.setUnknownFields(unknownFieldSet);
    }

    public final hV b(UnknownFieldSet unknownFieldSet) {
        return (hV)super.mergeUnknownFields(unknownFieldSet);
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
        return this.e();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.i();
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
        return this.e();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.i();
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
        return this.i();
    }

    public /* synthetic */ Message buildPartial() {
        return this.h();
    }

    public /* synthetic */ Message build() {
        return this.g();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.h();
    }

    public /* synthetic */ MessageLite build() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ Object clone() {
        return this.i();
    }
}

