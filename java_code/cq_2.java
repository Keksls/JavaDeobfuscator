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

/*
 * Renamed from cq
 */
public final class cq_2
extends GeneratedMessageV3.Builder<cq_2>
implements cr_1 {
    private int a;
    private long b;
    private List<bg_2> c = Collections.emptyList();
    private RepeatedFieldBuilderV3<bg_2, bi_2, bk_2> d;

    public static final Descriptors.Descriptor a() {
        return ak_2.C;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.D.ensureFieldAccessorsInitialized(co_1.class, cq_2.class);
    }

    cq_2() {
        this.o();
    }

    cq_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.o();
    }

    private void o() {
        if (co_1.l()) {
            this.q();
        }
    }

    public cq_2 f() {
        super.clear();
        this.b = 0L;
        if (this.d == null) {
            this.c = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
        } else {
            this.d.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_2.C;
    }

    public co_1 g() {
        return co_1.i();
    }

    public co_1 h() {
        co_1 co_12 = this.i();
        if (!co_12.isInitialized()) {
            throw cq_2.newUninitializedMessageException((Message)co_12);
        }
        return co_12;
    }

    public co_1 i() {
        co_1 co_12 = new co_1(this);
        int n = this.a;
        int n2 = 0;
        co_12.e = this.b;
        if (this.d == null) {
            if ((this.a & 2) == 2) {
                this.c = Collections.unmodifiableList(this.c);
                this.a &= 0xFFFFFFFD;
            }
            co_12.f = this.c;
        } else {
            co_12.f = this.d.build();
        }
        co_12.d = n2;
        this.onBuilt();
        return co_12;
    }

    public cq_2 j() {
        return (cq_2)super.clone();
    }

    public cq_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cq_2)super.setField(fieldDescriptor, object);
    }

    public cq_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (cq_2)super.clearField(fieldDescriptor);
    }

    public cq_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (cq_2)super.clearOneof(oneofDescriptor);
    }

    public cq_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (cq_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public cq_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cq_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public cq_2 a(Message message) {
        if (message instanceof co_1) {
            return this.a((co_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public cq_2 a(co_1 co_12) {
        if (co_12 == co_1.i()) {
            return this;
        }
        if (co_12.b() != 0L) {
            this.a(co_12.b());
        }
        if (this.d == null) {
            if (!co_12.f.isEmpty()) {
                if (this.c.isEmpty()) {
                    this.c = co_12.f;
                    this.a &= 0xFFFFFFFD;
                } else {
                    this.p();
                    this.c.addAll(co_12.f);
                }
                this.onChanged();
            }
        } else if (!co_12.f.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d.dispose();
                this.d = null;
                this.c = co_12.f;
                this.a &= 0xFFFFFFFD;
                this.d = co_1.m() ? this.q() : null;
            } else {
                this.d.addAllMessages(co_12.f);
            }
        }
        this.b(co_1.b(co_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public cq_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        co_1 co_12 = null;
        try {
            co_12 = (co_1)co_1.i.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            co_12 = (co_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (co_12 != null) {
                this.a(co_12);
            }
        }
        return this;
    }

    @Override
    public long b() {
        return this.b;
    }

    public cq_2 a(long l) {
        this.b = l;
        this.onChanged();
        return this;
    }

    public cq_2 k() {
        this.b = 0L;
        this.onChanged();
        return this;
    }

    private void p() {
        if ((this.a & 2) != 2) {
            this.c = new ArrayList<bg_2>(this.c);
            this.a |= 2;
        }
    }

    @Override
    public List<bg_2> c() {
        if (this.d == null) {
            return Collections.unmodifiableList(this.c);
        }
        return this.d.getMessageList();
    }

    @Override
    public int e() {
        if (this.d == null) {
            return this.c.size();
        }
        return this.d.getCount();
    }

    @Override
    public bg_2 a(int n) {
        if (this.d == null) {
            return this.c.get(n);
        }
        return (bg_2)this.d.getMessage(n);
    }

    public cq_2 a(int n, bg_2 bg_22) {
        if (this.d == null) {
            if (bg_22 == null) {
                throw new NullPointerException();
            }
            this.p();
            this.c.set(n, bg_22);
            this.onChanged();
        } else {
            this.d.setMessage(n, (AbstractMessage)bg_22);
        }
        return this;
    }

    public cq_2 a(int n, bi_2 bi_22) {
        if (this.d == null) {
            this.p();
            this.c.set(n, bi_22.i());
            this.onChanged();
        } else {
            this.d.setMessage(n, (AbstractMessage)bi_22.i());
        }
        return this;
    }

    public cq_2 a(bg_2 bg_22) {
        if (this.d == null) {
            if (bg_22 == null) {
                throw new NullPointerException();
            }
            this.p();
            this.c.add(bg_22);
            this.onChanged();
        } else {
            this.d.addMessage((AbstractMessage)bg_22);
        }
        return this;
    }

    public cq_2 b(int n, bg_2 bg_22) {
        if (this.d == null) {
            if (bg_22 == null) {
                throw new NullPointerException();
            }
            this.p();
            this.c.add(n, bg_22);
            this.onChanged();
        } else {
            this.d.addMessage(n, (AbstractMessage)bg_22);
        }
        return this;
    }

    public cq_2 a(bi_2 bi_22) {
        if (this.d == null) {
            this.p();
            this.c.add(bi_22.i());
            this.onChanged();
        } else {
            this.d.addMessage((AbstractMessage)bi_22.i());
        }
        return this;
    }

    public cq_2 b(int n, bi_2 bi_22) {
        if (this.d == null) {
            this.p();
            this.c.add(n, bi_22.i());
            this.onChanged();
        } else {
            this.d.addMessage(n, (AbstractMessage)bi_22.i());
        }
        return this;
    }

    public cq_2 a(Iterable<? extends bg_2> iterable) {
        if (this.d == null) {
            this.p();
            AbstractMessageLite.Builder.addAll(iterable, this.c);
            this.onChanged();
        } else {
            this.d.addAllMessages(iterable);
        }
        return this;
    }

    public cq_2 l() {
        if (this.d == null) {
            this.c = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.d.clear();
        }
        return this;
    }

    public cq_2 c(int n) {
        if (this.d == null) {
            this.p();
            this.c.remove(n);
            this.onChanged();
        } else {
            this.d.remove(n);
        }
        return this;
    }

    public bi_2 d(int n) {
        return (bi_2)this.q().getBuilder(n);
    }

    @Override
    public bk_2 b(int n) {
        if (this.d == null) {
            return this.c.get(n);
        }
        return (bk_2)this.d.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends bk_2> d() {
        if (this.d != null) {
            return this.d.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.c);
    }

    public bi_2 m() {
        return (bi_2)this.q().addBuilder((AbstractMessage)bg_2.k());
    }

    public bi_2 e(int n) {
        return (bi_2)this.q().addBuilder(n, (AbstractMessage)bg_2.k());
    }

    public List<bi_2> n() {
        return this.q().getBuilderList();
    }

    private RepeatedFieldBuilderV3<bg_2, bi_2, bk_2> q() {
        if (this.d == null) {
            this.d = new RepeatedFieldBuilderV3(this.c, (this.a & 2) == 2, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.c = null;
        }
        return this.d;
    }

    public final cq_2 a(UnknownFieldSet unknownFieldSet) {
        return (cq_2)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final cq_2 b(UnknownFieldSet unknownFieldSet) {
        return (cq_2)super.mergeUnknownFields(unknownFieldSet);
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
        return this.f();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.j();
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
        return this.f();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.j();
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
        return this.j();
    }

    public /* synthetic */ Message buildPartial() {
        return this.i();
    }

    public /* synthetic */ Message build() {
        return this.h();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.j();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.i();
    }

    public /* synthetic */ MessageLite build() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.f();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.g();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.g();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.j();
    }

    public /* synthetic */ Object clone() {
        return this.j();
    }
}

