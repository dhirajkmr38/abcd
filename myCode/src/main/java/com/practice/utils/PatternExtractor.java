//package com.practice.utils;
//
//
//import com.practice.pojo.InterruptibleCharSequence;
//
//import java.util.ArrayList;
//import java.util.ArrayList;
//import java.util.concurrent.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//
//public class PatternExtractor
//{
//
//    private Pattern pattern;
//    private String regEx;
//    private int timeOutInSeconds;
//
//
//    public PatternExtractor( String regEx )
//    {
//        this.regEx = regEx;
//        this.pattern = Pattern.compile( regEx );
//        timeOutInSeconds = 5;
//    }
//
//
//    public ArrayList<RegexMatchInfo> matchedPatterns( String text )
//    {
//        return matchedPatterns( text, null, 5 );
//    }
//
//
//    public ArrayList<RegexMatchInfo> matchedPatterns( String text, Integer groupNumber, int timeOutInSeconds )
//    {
//
//        ArrayList<RegexMatchInfo> matchedPatterns = new ArrayList<>();
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Matcher matcher = pattern.matcher( new InterruptibleCharSequence( text ) );
//        Future<ArrayList<RegexMatchInfo>> future = executorService.submit( () -> {
//            while ( matcher.find() ) {
//                if ( groupNumber != null ) {
//                    matchedPatterns
//                        .add( new RegexMatchInfo( matcher.group( groupNumber ).trim(), matcher.start(), matcher.end() ) );
//                } else {
//                    matchedPatterns.add( new RegexMatchInfo( matcher.group( 0 ).trim(), matcher.start(), matcher.end() ) );
//                }
//            }
//        }, matchedPatterns );
//        try {
//            return future.get( timeOutInSeconds, TimeUnit.SECONDS );
//        } catch ( InterruptedException | ExecutionException | TimeoutException e ) {
//            future.cancel( true );
//
//            return new ArrayList<>();
//        }
//    }
//
//
//    public boolean isMatchedPatterns( String text )
//    {
//
//        ArrayList<RegexMatchInfo> matchedPatterns = new ArrayList<>();
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Matcher matcher = pattern.matcher( new InterruptibleCharSequence( text ) );
//        Future<Boolean> future = executorService.submit( () -> matcher.find() );
//        try {
//            return future.get( timeOutInSeconds, TimeUnit.SECONDS );
//        } catch ( InterruptedException | ExecutionException | TimeoutException e ) {
//            future.cancel( true );
//
//            return false;
//        }
//    }
//}
