package com.king.condict.daoImpl;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

/**
 * @Author: guoning
 * @Description: // TODO
 * @Date: 2019/4/12 17:36
 * @Version: 1.0
 */

public class BaseDaoImpl<T> implements MongoRepository<T,String> {


    @Override
    public <S extends T> S save(S s) {
        return null;
    }

    @Override
    public <S extends T> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<T> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public Iterable<T> findAllById(Iterable<String> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(T t) {

    }

    @Override
    public void deleteAll(Iterable<? extends T> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<T> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends T> S insert(S s) {
        return null;
    }

    @Override
    public <S extends T> List<S> insert(Iterable<S> iterable) {
        return null;
    }

    @Override
    public <S extends T> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends T> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends T> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends T> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends T> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends T> boolean exists(Example<S> example) {
        return false;
    }
}
