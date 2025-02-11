package kr.megaptera.assignment.repositories;

import kr.megaptera.assignment.models.Comment;
import kr.megaptera.assignment.models.CommentId;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommentRepository {
    private final Map<CommentId, Comment> comments;

    public CommentRepository() {
        comments = new HashMap<>();
    }

    public List<Comment> findAll() {
        return new ArrayList<>(comments.values());
    }

    public Comment find(CommentId commentId) {
        return comments.get(commentId);
    }


    public void save(Comment comment) {
        comments.put(comment.id(), comment);
    }

    public void delete(CommentId commentId) {
        comments.remove(commentId);
    }
}
