package tyfrontier.cleanarchitecturesample.domain.usecase;

import javax.inject.Inject;

import rx.Observable;
import tyfrontier.cleanarchitecturesample.domain.model.Article;
import tyfrontier.cleanarchitecturesample.domain.repository.ArticleRepository;

public class FindArticlesImpl implements FindArticles {

    private final ArticleRepository articleRepository;

    @Inject
    public FindArticlesImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public Observable<Article> call(Integer requestIndex) {
        return articleRepository.findArticles(requestIndex);
    }
}
